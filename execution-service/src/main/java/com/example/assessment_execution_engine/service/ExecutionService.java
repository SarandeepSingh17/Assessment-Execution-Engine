package main.java.com.example.assessment_execution_engine.service;

@Service
public class ExecutionService {

    public String execute(String code) {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> request = new HashMap<>();
        request.put("source_code", code);
        request.put("language_id", "54");

        return restTemplate.postForObject(
            "https://judge0-ce.p.rapidapi.com/submissions?wait=true",
            request,
            String.class
        );
    }
}