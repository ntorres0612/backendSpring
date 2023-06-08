package backend.example.util;

import ai.openai.gpt.Gpt3;
import ai.openai.gpt.Gpt3Configuration;



import java.util.HashMap;
import java.util.Map;
public class ProductDescriptionGenerator {

    public ProductDescriptionGenerator() {
        String apiKey = "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";


        Gpt3Configuration configuration = Gpt3Configuration.builder()
                .apiKey(apiKey)
                .build();

        // Creación del generador de descripciones
        Gpt3 gpt3 = new Gpt3(configuration);



        // Datos de los productos y palabras clave asociadas
        Map<String, String> productKeywords = new HashMap<>();
        productKeywords.put("Producto 1", "electrónica, computadora, gaming");
        productKeywords.put("Producto 2", "ropa, moda, verano");
        productKeywords.put("Producto 3", "hogar, decoración, vintage");



        // Generación de descripciones de productos
        for (Map.Entry<String, String> entry : productKeywords.entrySet()) {
            String productName = entry.getKey();
            String keywords = entry.getValue();



            String description = generateProductDescription(gpt3, productName, keywords);
            System.out.println("Nombre del producto: " + productName);
            System.out.println("Descripción generada: " + description);
            System.out.println();
        }
    }
    private  String generateProductDescription(Gpt3 gpt3, String productName, String keywords) {
        // Formato de la solicitud al modelo de IA generativa
        String prompt = "Producto: " + productName + "\nPalabras clave: " + keywords + "\nDescripción:";



        // Generación de texto utilizando la biblioteca OpenAI GPT-3
        String response = gpt3.complete(prompt, 100); // Ajusta la longitud del texto generado según tus necesidades



        // Extracción de la descripción generada de la respuesta
        String description = response.substring(prompt.length()).trim();
        return description;
    }
}
