package defpackage;

import android.net.Uri;
import com.google.mlkit.common.MlKitException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class s0b {
    private static final bo7 e = new bo7("ModelLoader", "");
    public final jie a;
    public final wb9 b;
    protected c c = c.NO_MODEL_LOADED;
    private final b d;

    public interface a {
        void a(MappedByteBuffer mappedByteBuffer) throws MlKitException;
    }

    public interface b {
        void a(List<Integer> list);
    }

    public enum c {
        NO_MODEL_LOADED,
        REMOTE_MODEL_LOADED,
        LOCAL_MODEL_LOADED
    }

    public s0b(jie jieVar, wb9 wb9Var, b bVar) {
        boolean z = true;
        if (jieVar == null && wb9Var == null) {
            z = false;
        }
        yab.n("At least one of RemoteModelLoader or LocalModelLoader must be non-null.", z);
        yab.s(bVar);
        this.a = jieVar;
        this.b = wb9Var;
        this.d = bVar;
    }

    private final String c() {
        wb9 wb9Var = this.b;
        String string = null;
        if (wb9Var != null) {
            String strB = wb9Var.a().b();
            wb9 wb9Var2 = this.b;
            if (strB != null) {
                string = wb9Var2.a().b();
            } else {
                String strA = wb9Var2.a().a();
                wb9 wb9Var3 = this.b;
                if (strA != null) {
                    string = wb9Var3.a().a();
                } else if (wb9Var3.a().c() != null) {
                    Uri uriC = this.b.a().c();
                    yab.s(uriC);
                    string = uriC.toString();
                }
            }
        }
        jie jieVar = this.a;
        return nbh.w("Local model path: ", string, ". Remote model name: ", jieVar == null ? "unspecified" : jieVar.b().f(), ". ");
    }

    private final synchronized boolean d(a aVar, List list) throws MlKitException {
        MappedByteBuffer mappedByteBufferB;
        wb9 wb9Var = this.b;
        if (wb9Var == null || (mappedByteBufferB = wb9Var.b()) == null) {
            return false;
        }
        try {
            aVar.a(mappedByteBufferB);
            e.a("ModelLoader", "Local model source is loaded successfully");
            return true;
        } catch (RuntimeException e2) {
            list.add(18);
            throw e2;
        }
    }

    private final synchronized boolean e(a aVar, List list) throws MlKitException {
        jie jieVar = this.a;
        if (jieVar != null) {
            try {
                MappedByteBuffer mappedByteBufferC = jieVar.c();
                if (mappedByteBufferC != null) {
                    try {
                        aVar.a(mappedByteBufferC);
                        e.a("ModelLoader", "Remote model source is loaded successfully");
                        return true;
                    } catch (RuntimeException e2) {
                        list.add(19);
                        throw e2;
                    }
                }
                e.a("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(21);
            } catch (MlKitException e3) {
                e.a("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(20);
                throw e3;
            }
        }
        return false;
    }

    public synchronized boolean a() {
        return this.c == c.REMOTE_MODEL_LOADED;
    }

    public synchronized void b(a aVar) throws MlKitException {
        Exception exc;
        boolean zE;
        ArrayList arrayList = new ArrayList();
        boolean zD = false;
        Exception e2 = null;
        try {
            zE = e(aVar, arrayList);
            exc = null;
        } catch (Exception e3) {
            exc = e3;
            zE = false;
        }
        if (zE) {
            this.d.a(arrayList);
            this.c = c.REMOTE_MODEL_LOADED;
            return;
        }
        try {
            zD = d(aVar, arrayList);
        } catch (Exception e4) {
            e2 = e4;
        }
        if (zD) {
            this.d.a(arrayList);
            this.c = c.LOCAL_MODEL_LOADED;
            return;
        }
        arrayList.add(17);
        this.d.a(arrayList);
        this.c = c.NO_MODEL_LOADED;
        if (exc != null) {
            throw new MlKitException("Remote model load failed with the model options: ".concat(String.valueOf(c())), 14, exc);
        }
        if (e2 == null) {
            throw new MlKitException("Cannot load any model with the model options: ".concat(String.valueOf(c())), 14);
        }
        throw new MlKitException("Local model load failed with the model options: ".concat(String.valueOf(c())), 14, e2);
    }
}
