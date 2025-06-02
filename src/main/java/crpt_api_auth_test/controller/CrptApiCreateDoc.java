package crpt_api_auth_test.controller;

import crpt_api_auth_test.dto.DocDTO;
import crpt_api_auth_test.service.impl.DocServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CrptApiCreateDoc {

    private final DocServiceImpl docServiceImpl;

    public CrptApiCreateDoc(DocServiceImpl docServiceImpl) {
        this.docServiceImpl = docServiceImpl;
    }

    @PostMapping("/api/v3/lk/documents/create")
    public ResponseEntity<DocDTO> crptApiCreateDoc(@RequestParam String lp) {
        DocDTO docDTO = docServiceImpl.createDoc();
        return ResponseEntity.status(HttpStatus.OK).body(docDTO);
    }

}
