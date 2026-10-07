package one.me.sdk.fresco;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/fresco/FrescoHttpDownloadException;", "Ljava/io/IOException;", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FrescoHttpDownloadException extends IOException {
    public final int a;

    public FrescoHttpDownloadException(String str, int i) {
        super(str);
        this.a = i;
    }
}
