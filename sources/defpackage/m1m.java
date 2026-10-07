package defpackage;

import java.io.IOException;
import java.nio.channels.UnresolvedAddressException;
import java.nio.file.FileSystemException;
import javax.net.ssl.SSLException;
import one.me.sdk.transfer.upload.exceptions.UploadUnhandledException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m1m {
    public static final rp4 a(boolean z) {
        return new rp4(R.id.oneme_stories_action_hide_author, z ? new tnh(R.string.stories_unhide_author_action) : new tnh(R.string.stories_hide_author_action), Integer.valueOf(z ? R.drawable.icon_eye : R.drawable.icon_eye_crossed), (Integer) null, 20);
    }

    public static boolean b(Throwable th) {
        if (!(th instanceof UploadUnhandledException)) {
            if ((th instanceof FileSystemException) || (th instanceof SSLException)) {
                return false;
            }
            return (th instanceof UploadUnhandledException.RetriableException) || (th instanceof IOException) || (th instanceof UnresolvedAddressException);
        }
        Throwable c = ((UploadUnhandledException) th).getC();
        if (c == null) {
            return false;
        }
        int i = UploadUnhandledException.a;
        return b(c);
    }
}
