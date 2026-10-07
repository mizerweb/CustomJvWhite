package defpackage;

import com.vk.push.core.base.AidlException;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes4.dex */
public enum ytl implements oqk {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_INPUT(1),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_OUTPUT(2),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_TFLITE_VERSION(3),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_OP(4),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TYPE_ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_TYPE_MISUSE(7),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_UNKNOWN_ERROR(8),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIAPIPE_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_NOT_DOWNLOADED(100),
    /* JADX INFO: Fake field, exist only in values array */
    URI_EXPIRED(101),
    /* JADX INFO: Fake field, exist only in values array */
    NO_NETWORK_CONNECTION(102),
    /* JADX INFO: Fake field, exist only in values array */
    METERED_NETWORK(AidlException.HOST_IS_NOT_MASTER),
    DOWNLOAD_FAILED(AidlException.SDK_IS_NOT_INITIALIZED),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_TYPE_MISUSE(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_NOT_REGISTERED(106),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_TYPE_MISUSE(107),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_NOT_REGISTERED(108),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_TYPE_MISUSE(109),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_NOT_REGISTERED(110),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_TYPE_MISUSE(111),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_NOT_REGISTERED(112),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_TYPE_MISUSE(113),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_NOT_REGISTERED(114),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_TYPE_MISUSE(115),
    MODEL_HASH_MISMATCH(116),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NOT_AVAILABLE(201),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_INIT_ERROR(202),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_INFERENCE_ERROR(203),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_RELEASE_ERROR(204),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(205),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(206),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_CREATE_ERROR(207),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERAX_SOURCE_ERROR(301),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_CANT_START_ERROR(HttpStatus.SC_MOVED_TEMPORARILY),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR(HttpStatus.SC_SEE_OTHER),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR(HttpStatus.SC_NOT_MODIFIED),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR(HttpStatus.SC_USE_PROXY),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_UNAVAILABLE(HttpStatus.SC_BAD_REQUEST),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_CANCELLED(HttpStatus.SC_UNAUTHORIZED),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED(HttpStatus.SC_PAYMENT_REQUIRED),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_APP_NAME_UNAVAILABLE(HttpStatus.SC_FORBIDDEN),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_TASK_IN_PROGRESS(HttpStatus.SC_NOT_FOUND),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR(HttpStatus.SC_METHOD_NOT_ALLOWED),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_PIPELINE_INFERENCE_ERROR(HttpStatus.SC_NOT_ACCEPTABLE),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE(500),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE(HttpStatus.SC_NOT_IMPLEMENTED),
    /* JADX INFO: Fake field, exist only in values array */
    PERMISSION_DENIED(600),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED(601),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(602),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(603),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERROR(9999);

    public final int a;

    ytl(int i) {
        this.a = i;
    }

    @Override // defpackage.oqk
    public final int zza() {
        return this.a;
    }
}
