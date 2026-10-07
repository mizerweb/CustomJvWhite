package defpackage;

import com.google.mlkit.common.MlKitException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class iz4 {
    private static final bo7 h = new bo7("CustomModelLoader", "");
    private static final Map i = new HashMap();
    private final j0b a;
    private final vb9 b;
    private final kz4 c;
    private final gie d;
    private final hie e;
    private final s5m f;
    private boolean g;

    public interface a {
        boolean a(vb9 vb9Var) throws MlKitException;

        void b() throws MlKitException;
    }

    private iz4(j0b j0bVar, vb9 vb9Var, kz4 kz4Var) {
        j0b j0bVar2;
        kz4 kz4Var2;
        if (kz4Var != null) {
            j0bVar2 = j0bVar;
            kz4Var2 = kz4Var;
            hie hieVar = new hie(j0bVar2, kz4Var2, null, new p0b(j0bVar), new kmk(j0bVar, kz4Var.f()));
            this.e = hieVar;
            this.d = gie.g(j0bVar2, kz4Var2, new p0b(j0bVar2), hieVar, (r0b) j0bVar2.a(r0b.class));
            this.g = true;
        } else {
            j0bVar2 = j0bVar;
            kz4Var2 = kz4Var;
            this.e = null;
            this.d = null;
        }
        this.a = j0bVar2;
        this.b = vb9Var;
        this.c = kz4Var2;
        this.f = f6m.f();
    }

    public static synchronized iz4 e(j0b j0bVar, vb9 vb9Var, kz4 kz4Var) {
        String strF;
        Map map;
        try {
            if (kz4Var == null) {
                yab.s(vb9Var);
                strF = vb9Var.toString();
            } else {
                strF = kz4Var.f();
            }
            map = i;
            if (!map.containsKey(strF)) {
                map.put(strF, new iz4(j0bVar, vb9Var, kz4Var));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (iz4) map.get(strF);
    }

    private final File g() throws MlKitException {
        hie hieVar = this.e;
        yab.s(hieVar);
        String strD = hieVar.d();
        if (strD == null) {
            h.a("CustomModelLoader", "No existing model file");
            return null;
        }
        File file = new File(strD);
        File[] fileArrListFiles = file.listFiles();
        yab.s(fileArrListFiles);
        return fileArrListFiles.length == 1 ? fileArrListFiles[0] : file;
    }

    private final void h() throws MlKitException {
        gie gieVar = this.d;
        yab.s(gieVar);
        gieVar.j();
    }

    private static final vb9 i(File file) {
        if (file.isDirectory()) {
            vb9.a aVar = new vb9.a();
            aVar.c(new File(file.getAbsolutePath(), mf4.c).toString());
            return aVar.a();
        }
        vb9.a aVar2 = new vb9.a();
        aVar2.b(file.getAbsolutePath());
        return aVar2.a();
    }

    public synchronized vb9 a() throws MlKitException {
        h.a("CustomModelLoader", "Try to get the latest existing model file.");
        File fileG = g();
        if (fileG == null) {
            return null;
        }
        return i(fileG);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0094 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[Catch: all -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x0001, B:7:0x001f, B:9:0x0027, B:27:0x0096, B:13:0x002e, B:15:0x0045, B:18:0x004e, B:19:0x0067, B:21:0x006f, B:22:0x0087), top: B:32:0x0001 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0094, please report this as an issue */
    public synchronized vb9 b() throws MlKitException {
        File fileU;
        try {
            bo7 bo7Var = h;
            bo7Var.a("CustomModelLoader", "Try to get newly downloaded model file.");
            gie gieVar = this.d;
            yab.s(gieVar);
            Long lC = gieVar.c();
            String strD = this.d.d();
            if (lC == null || strD == null) {
                bo7Var.a("CustomModelLoader", "No new model is downloading.");
                h();
            } else {
                Integer numE = this.d.e();
                if (numE == null) {
                    h();
                } else {
                    bo7Var.a("CustomModelLoader", "Download Status code: ".concat(numE.toString()));
                    if (numE.intValue() == 8) {
                        fileU = this.d.u(strD);
                        if (fileU != null) {
                            bo7Var.a("CustomModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(fileU.getParent())));
                            this.d.l(strD);
                        }
                        if (fileU == null) {
                            return null;
                        }
                        return i(fileU);
                    }
                    if (numE.intValue() == 16) {
                        s5m s5mVar = this.f;
                        kz4 kz4Var = this.c;
                        wze wzeVarL = wze.l();
                        yab.s(kz4Var);
                        s5mVar.b(wzeVarL, kz4Var, this.d.f(lC));
                        h();
                    }
                }
            }
            fileU = null;
            if (fileU == null) {
                return null;
            }
            return i(fileU);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c() throws MlKitException {
        File fileG = g();
        if (fileG != null) {
            hie hieVar = this.e;
            yab.s(hieVar);
            hieVar.e(fileG);
            j0b j0bVar = this.a;
            kz4 kz4Var = this.c;
            a0g a0gVarG = a0g.g(j0bVar);
            yab.s(kz4Var);
            a0gVarG.c(kz4Var);
        }
    }

    public void d(vb9 vb9Var) throws MlKitException {
        String strA = vb9Var.a();
        yab.s(strA);
        File parentFile = new File(strA).getParentFile();
        hie hieVar = this.e;
        yab.s(hieVar);
        yab.s(parentFile);
        if (!hieVar.f(parentFile)) {
            h.b("CustomModelLoader", "Failed to delete old models");
        } else {
            h.a("CustomModelLoader", "All old models are deleted.");
            this.e.c(parentFile);
        }
    }

    public synchronized void f(a aVar) throws MlKitException {
        try {
            vb9 vb9VarA = this.b;
            if (vb9VarA == null) {
                vb9VarA = b();
            }
            if (vb9VarA == null) {
                vb9VarA = a();
            }
            if (vb9VarA == null) {
                throw new MlKitException("Model is not available.", 14);
            }
            do {
                boolean zA = aVar.a(vb9VarA);
                kz4 kz4Var = this.c;
                if (zA) {
                    if (kz4Var != null && this.g) {
                        d(vb9VarA);
                        this.g = false;
                    }
                    aVar.b();
                    return;
                }
                if (kz4Var != null) {
                    c();
                    vb9VarA = a();
                } else {
                    vb9VarA = null;
                }
            } while (vb9VarA != null);
            aVar.b();
        } catch (Throwable th) {
            throw th;
        }
    }
}
