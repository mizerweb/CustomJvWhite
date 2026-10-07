package defpackage;

import com.google.mlkit.common.MlKitException;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class jie {
    private static final bo7 h = new bo7("RemoteModelLoader", "");
    private static final Map i = new HashMap();
    private final j0b a;
    private final fie b;
    private final gie c;
    private final hie d;
    private final kie e;
    private final s5m f;
    private boolean g;

    private jie(j0b j0bVar, fie fieVar, w0b w0bVar, kie kieVar, iie iieVar) {
        hie hieVar = new hie(j0bVar, fieVar, w0bVar, new p0b(j0bVar), iieVar);
        this.d = hieVar;
        this.g = true;
        this.c = gie.g(j0bVar, fieVar, new p0b(j0bVar), hieVar, (r0b) j0bVar.a(r0b.class));
        this.e = kieVar;
        this.a = j0bVar;
        this.b = fieVar;
        this.f = f6m.f();
    }

    public static synchronized jie a(j0b j0bVar, fie fieVar, w0b w0bVar, kie kieVar, iie iieVar) {
        String strF;
        Map map;
        try {
            strF = fieVar.f();
            map = i;
            if (!map.containsKey(strF)) {
                map.put(strF, new jie(j0bVar, fieVar, w0bVar, kieVar, iieVar));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (jie) map.get(strF);
    }

    private final MappedByteBuffer d(String str) throws MlKitException {
        return this.e.a(str);
    }

    private final MappedByteBuffer e(File file) throws MlKitException {
        try {
            return d(file.getAbsolutePath());
        } catch (Exception e) {
            this.d.e(file);
            throw new MlKitException("Failed to load newly downloaded model.", 14, e);
        }
    }

    public fie b() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b7 A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:3:0x0001, B:7:0x001d, B:9:0x0025, B:28:0x00b7, B:30:0x00c6, B:32:0x00ce, B:35:0x00d4, B:36:0x00f2, B:37:0x00f3, B:13:0x0030, B:15:0x0047, B:18:0x0050, B:20:0x006e, B:22:0x0076, B:23:0x0088, B:25:0x0090, B:26:0x00a7), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c6 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:3:0x0001, B:7:0x001d, B:9:0x0025, B:28:0x00b7, B:30:0x00c6, B:32:0x00ce, B:35:0x00d4, B:36:0x00f2, B:37:0x00f3, B:13:0x0030, B:15:0x0047, B:18:0x0050, B:20:0x006e, B:22:0x0076, B:23:0x0088, B:25:0x0090, B:26:0x00a7), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f3 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:3:0x0001, B:7:0x001d, B:9:0x0025, B:28:0x00b7, B:30:0x00c6, B:32:0x00ce, B:35:0x00d4, B:36:0x00f2, B:37:0x00f3, B:13:0x0030, B:15:0x0047, B:18:0x0050, B:20:0x006e, B:22:0x0076, B:23:0x0088, B:25:0x0090, B:26:0x00a7), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized MappedByteBuffer c() throws MlKitException {
        MappedByteBuffer mappedByteBufferD;
        MappedByteBuffer mappedByteBufferE;
        String strD;
        try {
            bo7 bo7Var = h;
            bo7Var.a("RemoteModelLoader", "Try to load newly downloaded model file.");
            gie gieVar = this.c;
            boolean z = this.g;
            Long lC = gieVar.c();
            String strD2 = gieVar.d();
            mappedByteBufferD = null;
            if (lC == null || strD2 == null) {
                bo7Var.a("RemoteModelLoader", "No new model is downloading.");
                this.c.j();
            } else {
                Integer numE = this.c.e();
                if (numE == null) {
                    this.c.j();
                } else {
                    bo7Var.a("RemoteModelLoader", "Download Status code: ".concat(numE.toString()));
                    if (numE.intValue() == 8) {
                        File fileU = this.c.u(strD2);
                        if (fileU != null) {
                            mappedByteBufferE = e(fileU);
                            bo7Var.a("RemoteModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(fileU.getParent())));
                            this.c.l(strD2);
                            if (z && this.d.f(fileU)) {
                                bo7Var.a("RemoteModelLoader", "All old models are deleted.");
                                mappedByteBufferE = e(this.d.c(fileU));
                            }
                        }
                        if (mappedByteBufferE == null) {
                            bo7Var.a("RemoteModelLoader", "Loading existing model file.");
                            strD = this.d.d();
                            if (strD == null) {
                                bo7Var.a("RemoteModelLoader", "No existing model file");
                            } else {
                                try {
                                    mappedByteBufferD = d(strD);
                                } catch (Exception e) {
                                    this.d.e(new File(strD));
                                    a0g.g(this.a).c(this.b);
                                    throw new MlKitException("Failed to load an already downloaded model.", 14, e);
                                }
                            }
                        } else {
                            this.g = false;
                            mappedByteBufferD = mappedByteBufferE;
                        }
                    } else if (numE.intValue() == 16) {
                        this.f.b(wze.l(), this.b, this.c.f(lC));
                        this.c.j();
                    }
                }
            }
            mappedByteBufferE = null;
            if (mappedByteBufferE == null) {
                bo7Var.a("RemoteModelLoader", "Loading existing model file.");
                strD = this.d.d();
                if (strD == null) {
                    bo7Var.a("RemoteModelLoader", "No existing model file");
                } else {
                    mappedByteBufferD = d(strD);
                }
            } else {
                this.g = false;
                mappedByteBufferD = mappedByteBufferE;
            }
        } catch (Throwable th) {
            throw th;
        }
        return mappedByteBufferD;
    }
}
