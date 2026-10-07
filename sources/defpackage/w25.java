package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class w25 implements xx0 {
    public static final pah f = rx8.S(new v25(0));
    public final h1b a;
    public final p95 b;
    public final BitmapFactory.Options c;
    public final int d;
    public final boolean e;

    public w25(s84 s84Var) {
        this.b = new p95((Context) s84Var.c);
        h1b h1bVar = (h1b) f.get();
        h1bVar.getClass();
        this.a = h1bVar;
        this.c = null;
        this.d = s84Var.a;
        this.e = s84Var.b;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0064 A[RETURN] */
    @Override // defpackage.xx0
    public final boolean c(String str) {
        String str2 = vqi.a;
        switch (str) {
            case "image/avif":
                if (Build.VERSION.SDK_INT >= 34) {
                    return true;
                }
                return false;
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.xx0
    public final e89 n(Uri uri) {
        return this.a.b(new vs4(this, 2, uri));
    }

    @Override // defpackage.xx0
    public final e89 p(byte[] bArr) {
        return this.a.b(new vs4(this, 1, bArr));
    }

    public w25(h1b h1bVar, p95 p95Var, BitmapFactory.Options options) {
        this.a = h1bVar;
        this.b = p95Var;
        this.c = options;
        this.d = np0.r;
        this.e = false;
    }
}
