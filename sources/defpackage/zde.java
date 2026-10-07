package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zde {
    public final /* synthetic */ qi0 a;
    public final /* synthetic */ vde b;
    public final /* synthetic */ xr6 c;

    public /* synthetic */ zde(qi0 qi0Var, vde vdeVar, xr6 xr6Var) {
        this.a = qi0Var;
        this.b = vdeVar;
        this.c = xr6Var;
    }

    public final r9b a(int i, mx1 mx1Var) {
        r9b jrcVar;
        int i2 = 9;
        int i3 = 10;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        switch (this.b.a) {
            case 0:
                if (i == 0 || i == 2) {
                    tvj.a("Recorder", "Create Media3MuxerImpl");
                    jrcVar = new jrc((char) (b == true ? 1 : 0), i2);
                } else {
                    tvj.a("Recorder", "Create MediaMuxerImpl");
                    jrcVar = new jrc((char) (b2 == true ? 1 : 0), i3);
                }
                break;
            default:
                jrcVar = (i != 0 && i != 2) ? new kzi(new jrc((char) (b4 == true ? 1 : 0), i3)) : new kzi(new jrc((char) (b3 == true ? 1 : 0), i2));
                break;
        }
        Uri uri = Uri.EMPTY;
        xr6 xr6Var = this.c;
        if (!(xr6Var instanceof xr6)) {
            c.e("Invalid output options type: ".concat(xr6Var.getClass().getSimpleName()));
            return null;
        }
        File file = xr6Var.b.c;
        File parentFile = file.getParentFile();
        if (!(parentFile != null ? parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs() : false)) {
            tvj.g("Recorder", "Failed to create folder for " + file.getAbsolutePath());
        }
        tvj.a("Recorder", "Muxer.setOutput by path = " + file.getAbsolutePath());
        jrcVar.e(i, file.getAbsolutePath());
        ((dee) mx1Var.b).L = Uri.fromFile(file);
        return jrcVar;
    }
}
