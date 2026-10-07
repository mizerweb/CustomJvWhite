package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gv8 extends ru8 {
    public String i;
    public boolean j;

    @Override // defpackage.ru8
    public final jt8 H() {
        return new cu8((LinkedHashMap) this.h);
    }

    @Override // defpackage.ru8
    public final void K(jt8 jt8Var, String str) {
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                str2 = null;
            }
            linkedHashMap.put(str2, jt8Var);
            this.j = true;
            return;
        }
        if (jt8Var instanceof pu8) {
            this.i = ((pu8) jt8Var).a();
            this.j = false;
        } else {
            if (jt8Var instanceof cu8) {
                throw xd2.c(fu8.b);
            }
            if (jt8Var instanceof ss8) {
                throw xd2.c(vs8.b);
            }
            ore.o();
        }
    }
}
