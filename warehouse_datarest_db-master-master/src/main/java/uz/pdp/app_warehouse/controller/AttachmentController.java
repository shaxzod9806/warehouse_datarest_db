package uz.pdp.app_warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.app_warehouse.entity.attachment.Attachment;
import uz.pdp.app_warehouse.payload.Result;
import uz.pdp.app_warehouse.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;

    @PostMapping(value = "/upload")
    public Result uploadFile(MultipartHttpServletRequest request) throws IOException {
        Result result = attachmentService.uploadFile(request);

        return result;
    }

    @GetMapping(value = "/download/{id}")
    public void downloadFile(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attachmentService.downloadFile(id, response);
    }

    @GetMapping(value = "/info")
    public List<Attachment> getAll() {
        List<Attachment> all = attachmentService.getAll();

        return all;
    }

    @GetMapping(value = "/info/{id}")
    public Attachment getById(@PathVariable Integer id) {
        Attachment attachment = attachmentService.getById(id);

        return attachment;
    }
}
