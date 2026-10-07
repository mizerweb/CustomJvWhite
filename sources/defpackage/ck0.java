package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck0 implements gdd {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v71 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ufe e;
    public final /* synthetic */ wfe f;

    public /* synthetic */ ck0(String str, int i, v71 v71Var, int i2, ufe ufeVar, wfe wfeVar) {
        this.a = str;
        this.b = i;
        this.c = v71Var;
        this.d = i2;
        this.e = ufeVar;
        this.f = wfeVar;
    }

    @Override // defpackage.gdd
    /* JADX INFO: renamed from: apply */
    public final boolean mo28apply(Object obj) {
        int i;
        v71 v71Var = (v71) obj;
        if (v71Var instanceof ay0) {
            ay0 ay0Var = (ay0) v71Var;
            String str = ay0Var.a;
            v71 v71Var2 = ay0Var.e;
            if (ay0Var.b == null && (v71Var2 == null || v71Var2.equals(this.c))) {
                String str2 = this.a;
                int i2 = this.b;
                if (str.regionMatches(0, str2, 0, i2)) {
                    int size = vs0.n.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        String str3 = ((ts0) vs0.n.get(i3)).d;
                        if (str.length() == str3.length() + i2 && str.regionMatches(i2, str3, 0, str3.length())) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 >= 0 && i3 != (i = this.d)) {
                        int size2 = ((i3 > i ? i3 - i : (vs0.n.size() - 1) - i3) * 2) + ((v71Var2 != null ? 1 : 0) ^ 1);
                        ufe ufeVar = this.e;
                        if (size2 < ufeVar.a) {
                            ufeVar.a = size2;
                            this.f.a = str;
                        }
                    }
                }
            }
        }
        return false;
    }
}
