package com.kubectldemo.kubectldemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    /*echo "# minikubeDemo" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/KartyGk/minikubeDemo.git
    git push -u origin main*/


    @GetMapping("/minikube")
    public String kubectlDemoRep(){
        return "minikube";
    }

}
