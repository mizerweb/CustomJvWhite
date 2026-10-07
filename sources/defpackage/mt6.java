package defpackage;

import android.net.Uri;
import java.io.File;
import one.me.sdk.transfer.upload.exceptions.UploadUnhandledException;

/* JADX INFO: loaded from: classes3.dex */
public final class mt6 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;

    public mt6(int i, String str, String str2) throws UploadUnhandledException.FileOpenException {
        je9 je9Var = je9.f;
        this.a = i;
        this.b = str;
        this.c = str2;
        String name = mt6.class.getName();
        File file = new File(str);
        this.d = i == 6 ? (str2 == null || str2.length() == 0) ? file.getName() : Uri.encode(str2) : (str2 == null || str2.length() == 0) ? String.valueOf(file.getName().hashCode()) : Uri.encode(str2);
        long length = file.length();
        this.e = length;
        this.f = file.getPath();
        if (!file.exists()) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "File not found by path=".concat(str), null);
            }
            throw new UploadUnhandledException.FileOpenException("File not found", null);
        }
        if (length == 0) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name, "Upload failed: trying to upload file with zero length", null);
            }
            throw new UploadUnhandledException.FileOpenException("File is zero length", null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt6)) {
            return false;
        }
        mt6 mt6Var = (mt6) obj;
        return this.a == mt6Var.a && cqk.d(this.b, mt6Var.b) && cqk.d(this.c, mt6Var.c);
    }

    public final int hashCode() {
        int iD = zo5.d(qt4.D(this.a) * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadFile(type=");
        sb.append(v0h.o(this.a));
        sb.append(", path=");
        sb.append(this.b);
        sb.append(", explicitFileName=");
        return zo5.w(sb, this.c, ")");
    }
}
