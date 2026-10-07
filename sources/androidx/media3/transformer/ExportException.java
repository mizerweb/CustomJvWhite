package androidx.media3.transformer;

import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import defpackage.fhe;
import defpackage.l88;
import defpackage.lh6;
import defpackage.qt4;

/* JADX INFO: loaded from: classes2.dex */
public final class ExportException extends Exception {
    public static final fhe c;
    public final int a;
    public final lh6 b;

    static {
        l88 l88Var = new l88(4);
        l88Var.q("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001);
        l88Var.q("ERROR_CODE_IO_UNSPECIFIED", 2000);
        l88Var.q("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        l88Var.q("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        l88Var.q("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        l88Var.q("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        l88Var.q("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        l88Var.q("ERROR_CODE_IO_NO_PERMISSION", 2006);
        l88Var.q("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        l88Var.q("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        l88Var.q("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        l88Var.q("ERROR_CODE_DECODING_FAILED", 3002);
        l88Var.q("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        l88Var.q("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        l88Var.q("ERROR_CODE_ENCODING_FAILED", 4002);
        l88Var.q("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        l88Var.q("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        l88Var.q("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        l88Var.q("ERROR_CODE_MUXING_FAILED", 7001);
        l88Var.q("ERROR_CODE_MUXING_TIMEOUT", 7002);
        l88Var.q("ERROR_CODE_MUXING_APPEND", 7003);
        c = l88Var.p();
    }

    public ExportException(String str, Throwable th, int i, lh6 lh6Var) {
        super(str, th);
        this.a = i;
        SystemClock.elapsedRealtime();
        this.b = lh6Var;
    }

    public static ExportException a(int i, Throwable th) {
        return new ExportException("Asset loader error", th, i, null);
    }

    public static ExportException b(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, String str) {
        StringBuilder sbV = qt4.v("Audio error: ", str, ", audioFormat=");
        sbV.append(audioProcessor$UnhandledAudioFormatException.a);
        return new ExportException(sbV.toString(), audioProcessor$UnhandledAudioFormatException, 6001, null);
    }

    public static ExportException c(Exception exc, int i, lh6 lh6Var) {
        return new ExportException("Codec exception: " + lh6Var, exc, i, lh6Var);
    }

    public static ExportException d(RuntimeException runtimeException) {
        return new ExportException("Unexpected runtime error", runtimeException, 1001, null);
    }

    public final String e() {
        Object obj = c.h.get(Integer.valueOf(this.a));
        if (obj == null) {
            obj = "invalid error code";
        }
        return (String) obj;
    }
}
