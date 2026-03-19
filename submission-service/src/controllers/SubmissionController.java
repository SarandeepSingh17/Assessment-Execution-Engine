@RestController
@RequestMapping("/submit")
public class SubmissionController {

    @PostMapping
    public String submit(@RequestBody String code) {
        return "Received: " + code;
    }
}