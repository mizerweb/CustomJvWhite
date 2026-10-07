package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class k84 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public k84(c98 c98Var, er3 er3Var, j36 j36Var, boolean z, boolean z2, int i, boolean z3) {
        boolean z4 = true;
        this.a = 1;
        Iterator it = c98Var.iterator();
        if (it.hasNext()) {
            ((t26) it.next()).getClass();
        } else {
            z4 = false;
        }
        lvb.O("Composition must have at least one non-looping sequence.", z4);
        this.b = c98.n(c98Var);
        this.c = er3Var;
        this.d = j36Var;
        this.e = z;
        this.f = z2;
        this.g = i;
        this.h = z3;
    }

    public k84 a() {
        c98 c98Var = (c98) this.b;
        er3 er3Var = (er3) this.c;
        j36 j36Var = (j36) this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        int i = this.g;
        return new k84(c98Var, er3Var, j36Var, z, z2, i, this.h && i == 0);
    }

    public lf5 b() {
        return new lf5(!this.e, (wm7) this.c, (ExecutorService) this.b, (en7) this.d, this.g, this.f, this.h);
    }

    public k84 c() {
        k84 k84Var = new k84(0);
        k84Var.b = (c98) this.b;
        k84Var.c = (er3) this.c;
        k84Var.d = (j36) this.d;
        k84Var.e = this.e;
        k84Var.f = this.f;
        k84Var.g = this.g;
        k84Var.h = this.h;
        return k84Var;
    }

    public void d(List list) {
        lvb.O("The composition must contain at least one EditedMediaItemSequence.", !list.isEmpty());
        this.b = c98.n(list);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                c98 c98Var = (c98) this.b;
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < c98Var.size(); i++) {
                        jSONArray.put(((t26) c98Var.get(i)).b());
                    }
                    jSONObject.put("sequences", jSONArray);
                    jSONObject.put("effects", ((j36) this.d).a());
                    jSONObject.put("transmuxAudio", this.e);
                    jSONObject.put("transmuxVideo", this.f);
                    jSONObject.put("hdrMode", this.g);
                    jSONObject.put("retainHdrFromUltraHdrImage", this.h);
                    break;
                } catch (JSONException e) {
                    lvb.H0("Composition", "JSON conversion failed.", e);
                    jSONObject = new JSONObject();
                }
                return jSONObject.toString();
            default:
                return super.toString();
        }
    }

    public k84(t26 t26Var, t26[] t26VarArr) {
        this.a = 0;
        z88 z88Var = new z88(4);
        z88Var.c(t26Var);
        z88Var.d(t26VarArr);
        ghe gheVarH = z88Var.h();
        lvb.O("The composition must contain at least one EditedMediaItemSequence.", !gheVarH.isEmpty());
        this.b = c98.n(gheVarH);
        this.c = er3.m;
        this.d = j36.c;
    }

    public /* synthetic */ k84(int i) {
        this.a = i;
    }
}
