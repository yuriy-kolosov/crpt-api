package crpt_api_auth_test.service.impl;

import crpt_api_auth_test.dto.DocDTO;
import crpt_api_auth_test.service.DocService;
import org.springframework.stereotype.Service;

@Service
public class DocServiceImpl implements DocService {

    @Override
    public DocDTO createDoc() {
        DocDTO docDTO = new DocDTO();
        docDTO.setId("id");
        docDTO.setMessage("message");
        return docDTO;
    }
}
