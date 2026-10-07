package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum n1j implements o1j {
    OUT_OF_MEMORY("out_of_memory"),
    CAMERA_PERMISSION("camera_permission"),
    MIC_PERMISSION("mic_permission"),
    CAMERA_NOT_FOUND("camera_not_found"),
    CAMERA_ERROR_ON_RECORD("camera_error_on_record"),
    UPLOAD_ERROR("upload_error");

    public final String a;

    n1j(String str) {
        this.a = str;
    }

    @Override // defpackage.o1j
    public final String getTitle() {
        return this.a;
    }
}
