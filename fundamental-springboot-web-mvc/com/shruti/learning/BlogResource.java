
@RestController
public class BlogResource{

    @GetMapping(name= "\blog")
    public BlogPost getBlogPost(@Pathvariable Date date){
        return null;
    }

    @GetMapping(name= "\blog")
    public BlogPost getBlogPost(@Pathvariable Date date, @RequestParam String searchKey){
        return null;
    }
}