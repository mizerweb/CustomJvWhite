package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b08 extends a8j {
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final SharedPreferences f;
    public final ArrayList g;
    public final mjg h;
    public final ic6 i;

    public b08(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, Context context) {
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var;
        this.f = context.getSharedPreferences("dev_tools", 0);
        List listP0 = xw3.P0("api2.oneme.ru", "api-test.oneme.ru", "api-tg.oneme.ru", "api-test2.oneme.ru");
        ArrayList arrayList = new ArrayList(listP0.size());
        arrayList.addAll(listP0);
        cx3.a1(arrayList, new String[0]);
        this.g = arrayList;
        this.h = p90.a(C());
        this.i = new ic6(null);
    }

    public final zed B() {
        return (zed) this.c.getValue();
    }

    public final c79 C() {
        c79 c79VarW = yab.w();
        ArrayList<String> arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        for (String str : arrayList) {
            arrayList2.add(new hz7(str, Boolean.valueOf(cqk.d(str, B().a.W()))));
        }
        c79VarW.addAll(arrayList2);
        String strO = "";
        String string = this.f.getString("Custom", "");
        if (string != null && string.length() != 0) {
            strO = c0a.o(" (", string, ")");
        }
        c79VarW.add(new hz7("Custom".concat(strO), Boolean.valueOf(cqk.d(string, B().a.W()))));
        return yab.j(c79VarW);
    }

    public final void D(String str) {
        xt4 xt4VarA = ((n0c) ((xhh) this.d.getValue())).a();
        zhb zhbVar = zhb.b;
        xt4VarA.getClass();
        yab.i0(this.b, lvb.x0(xt4VarA, zhbVar), 0, new el6(str, this, null, 9), 2);
    }
}
