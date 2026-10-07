package defpackage;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.transfer.exceptions.HttpErrorException;

/* JADX INFO: loaded from: classes4.dex */
public final class zec implements iii {
    public final String a;
    public final ExecutorService b;
    public final String c;
    public final u1i d;
    public final wze e;
    public final int f;
    public final oji g;
    public final int h;
    public final String i;
    public final String j;
    public final ny8 k;
    public final File l;
    public final long m;
    public final AtomicBoolean n;
    public final ifh o;

    public zec(String str, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, String str2, ExecutorService executorService, String str3, u1i u1iVar, wze wzeVar, int i, oji ojiVar, int i2, String str4) throws HttpErrorException {
        je9 je9Var = je9.g;
        this.a = str2;
        this.b = executorService;
        this.c = str3;
        this.d = u1iVar;
        this.e = wzeVar;
        this.f = i;
        this.g = ojiVar;
        this.h = i2;
        this.i = str4;
        if (i2 != 3 && i2 != 4 && i2 != 2) {
            c.o("OneVideoUploadOperation supports UploadType.VIDEO, UploadType.VIDEO_MESSAGE and UploadType.AUDIO only. Value passed: ".concat(v0h.o(i2)));
            throw null;
        }
        String name = zec.class.getName();
        this.j = name;
        this.k = ny8Var3;
        File file = new File(str);
        this.l = file;
        long length = file.length();
        this.m = length;
        this.n = new AtomicBoolean(false);
        this.o = new ifh(new ja1(ny8Var, ny8Var2, ny8Var3, this));
        if (!file.exists()) {
            String strConcat = "File by path not found=".concat(str);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9Var, name, strConcat, null, null, 8);
            }
            throw new HttpErrorException("File not found", null, null, 6);
        }
        if (length == 0) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name, "Upload failed: trying to upload file with zero length", null);
            }
            throw new HttpErrorException("File is zero length", null, null, 6);
        }
    }

    @Override // defpackage.iii
    public final xx6 a() {
        this.n.compareAndSet(false, true);
        lq4 lq4Var = null;
        return new bye(new wz6((Object) e9i.H(new qz1(e9i.r(new wz6(this, lq4Var, 27)), 2), new wf0(14)), (Object) new ut6(3, lq4Var, 1), lq4Var, 0));
    }
}
