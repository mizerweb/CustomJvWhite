package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gif implements fif, j81 {
    public final fif a;
    public final String b;
    public final Set c;

    public gif(fif fifVar) {
        this.a = fifVar;
        this.b = fifVar.i() + '?';
        this.c = wk8.f(fifVar);
    }

    @Override // defpackage.j81
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.fif
    public final boolean b() {
        return true;
    }

    @Override // defpackage.fif
    public final int c(String str) {
        return this.a.c(str);
    }

    @Override // defpackage.fif
    public final lvb d() {
        return this.a.d();
    }

    @Override // defpackage.fif
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gif) {
            return cqk.d(this.a, ((gif) obj).a);
        }
        return false;
    }

    @Override // defpackage.fif
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.fif
    public final List g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.fif
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.fif
    public final fif h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.fif
    public final String i() {
        return this.b;
    }

    @Override // defpackage.fif
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.fif
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
