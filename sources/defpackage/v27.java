package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v27 extends w27 {
    public final CharSequence a;
    public final String b;
    public final boolean c;

    public v27(CharSequence charSequence, String str, boolean z) {
        this.a = charSequence;
        this.b = str;
        this.c = z;
    }

    public static v27 b(v27 v27Var, CharSequence charSequence, boolean z, int i) {
        if ((i & 1) != 0) {
            charSequence = v27Var.a;
        }
        String str = v27Var.b;
        v27Var.getClass();
        return new v27(charSequence, str, z);
    }

    @Override // defpackage.w27
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v27)) {
            return false;
        }
        v27 v27Var = (v27) obj;
        return cqk.d(this.a, v27Var.a) && cqk.d(this.b, v27Var.b) && this.c == v27Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + zo5.d((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Edit(name=");
        sb.append((Object) this.a);
        sb.append(", folderId=");
        sb.append(this.b);
        sb.append(", canSave=");
        return qt4.r(sb, this.c, ")");
    }

    public /* synthetic */ v27(String str, CharSequence charSequence, int i) {
        this((i & 1) != 0 ? null : charSequence, str, false);
    }
}
