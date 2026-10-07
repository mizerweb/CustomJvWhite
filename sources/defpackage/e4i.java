package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class e4i implements d4i {
    public final Set a;
    public final ij0 b;
    public final g4i c;

    public e4i(Set set, ij0 ij0Var, g4i g4iVar) {
        this.a = set;
        this.b = ij0Var;
        this.c = g4iVar;
    }

    public final f4i a(String str, z86 z86Var, f2i f2iVar) {
        Set set = this.a;
        if (set.contains(z86Var)) {
            return new f4i(this.b, str, z86Var, f2iVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", z86Var, set));
    }
}
