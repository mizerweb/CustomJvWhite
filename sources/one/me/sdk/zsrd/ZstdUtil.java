package one.me.sdk.zsrd;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/zsrd/ZstdUtil;", "", "", "input", "nativeDecompress", "([B)[B", "zstd"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class ZstdUtil {
    static {
        System.loadLibrary("zstd");
    }

    public static byte[] a(byte[] bArr) {
        return nativeDecompress(bArr);
    }

    private static final native byte[] nativeDecompress(byte[] input) throws IOException, IllegalArgumentException;
}
