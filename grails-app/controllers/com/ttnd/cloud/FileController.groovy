package com.ttnd.cloud

import org.springframework.web.multipart.MultipartFile

class FileController extends BaseController {
    public static final String ASSET_LOCATION = "/opt/files"

    def upload() {
        MultipartFile multipartFile = params.file
        File assetLocation = assetDir()
        if (multipartFile) {
            multipartFile.transferTo(new File(assetLocation, multipartFile.originalFilename))
            [downloadLink: g.createLink(action: 'download', params: [fileName: multipartFile.originalFilename])]
        }
    }

    def download(String fileName) {
        File assetLocation = assetDir()
        render file: new FileInputStream(new File(assetLocation, fileName)), contentType: 'image/png'
    }

    private static File assetDir() {
        File assetLocation = new File(ASSET_LOCATION)
        if (!assetLocation.exists()) {
            assetLocation.mkdirs()
        }
        return assetLocation
    }
}
