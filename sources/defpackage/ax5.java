package defpackage;

import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class ax5 implements en5 {
    public final int a;
    public final oah b;
    public final String c;
    public final ghb d;
    public volatile v2a e = new v2a((h81) null, (File) null);

    public ax5(int i, oah oahVar, String str, ghb ghbVar) {
        this.a = i;
        this.d = ghbVar;
        this.b = oahVar;
        this.c = str;
    }

    @Override // defpackage.en5
    public final void a() {
        try {
            c().a();
        } catch (IOException e) {
            if (pj6.a.h(6)) {
                pj6.a.e(ax5.class.getSimpleName(), "purgeUnexpectedResources", e);
            }
        }
    }

    public final void b() throws FileUtils$CreateDirectoryException {
        File file = new File((File) this.b.get(), this.c);
        try {
            wk8.y(file);
            String absolutePath = file.getAbsolutePath();
            if (pj6.a.h(3)) {
                pj6.a.d(ax5.class.getSimpleName(), "Created cache directory " + absolutePath);
            }
            this.e = new v2a(new h81(file, this.a, this.d), file);
        } catch (FileUtils$CreateDirectoryException e) {
            this.d.getClass();
            throw e;
        }
    }

    public final synchronized en5 c() {
        en5 en5Var;
        File file;
        v2a v2aVar = this.e;
        if (((en5) v2aVar.b) == null || (file = (File) v2aVar.c) == null || !file.exists()) {
            if (((en5) this.e.b) != null && ((File) this.e.c) != null) {
                qe7.o((File) this.e.c);
            }
            b();
        }
        en5Var = (en5) this.e.b;
        en5Var.getClass();
        return en5Var;
    }

    @Override // defpackage.en5
    public final vbf f(String str, l6g l6gVar) {
        return c().f(str, l6gVar);
    }

    @Override // defpackage.en5
    public final dq6 g(Object obj, String str) {
        return c().g(obj, str);
    }

    @Override // defpackage.en5
    public final boolean h(String str, l6g l6gVar) {
        return c().h(str, l6gVar);
    }

    @Override // defpackage.en5
    public final boolean isExternal() {
        try {
            return c().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.en5
    public final long k(u95 u95Var) {
        return c().k(u95Var);
    }

    @Override // defpackage.en5
    public final Collection l() {
        return c().l();
    }

    @Override // defpackage.en5
    public final void m() {
        c().m();
    }

    @Override // defpackage.en5
    public final long remove(String str) {
        return c().remove(str);
    }
}
