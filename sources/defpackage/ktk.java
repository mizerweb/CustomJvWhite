package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ktk {
    public static gka a(jka jkaVar) {
        fvi fviVar;
        uj6 uj6Var = new uj6();
        u75 u75Var = jkaVar.a;
        uj6Var.c = new pia(u75Var.a, u75Var.b, (String) u75Var.c);
        uj6Var.b = jkaVar.c;
        uj6Var.a = jkaVar.b;
        uj6Var.d = jkaVar.d;
        a70 a70Var = jkaVar.e;
        if (a70Var == null) {
            fviVar = null;
        } else {
            a70 a70Var2 = new a70(1);
            a70Var2.a = a70Var.a;
            a70Var2.c = a70Var.c;
            a70Var2.b = a70Var.b;
            a70Var2.d = (List) a70Var.d;
            a70Var2.e = a70Var.e;
            fviVar = new fvi(a70Var2);
        }
        uj6Var.e = fviVar;
        return new gka(uj6Var);
    }

    public static jka b(gka gkaVar) {
        a70 a70Var;
        jka jkaVar = new jka();
        pia piaVar = gkaVar.a;
        u75 u75Var = new u75();
        u75Var.b = piaVar.b;
        u75Var.a = piaVar.a;
        u75Var.c = piaVar.c;
        jkaVar.a = u75Var;
        jkaVar.c = gkaVar.c;
        jkaVar.b = gkaVar.b;
        jkaVar.d = gkaVar.d;
        fvi fviVar = gkaVar.e;
        if (fviVar == null) {
            a70Var = null;
        } else {
            a70 a70Var2 = new a70();
            a70Var2.c = fviVar.c;
            a70Var2.b = fviVar.b;
            a70Var2.a = fviVar.a;
            a70Var2.e = fviVar.e;
            a70Var2.d = fviVar.d;
            a70Var = a70Var2;
        }
        jkaVar.e = a70Var;
        return jkaVar;
    }

    public static void c(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }
}
