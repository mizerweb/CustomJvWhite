package defpackage;

import android.content.Context;
import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gc4 extends RecyclerView implements eph {
    public static final /* synthetic */ zv8[] q2 = {new z8b(gc4.class, "state", "getState()Lone/me/sdk/codeinput/ConfirmSmsInputView$State;"), zo5.e(zfe.a, gc4.class, "countCells", "getCountCells()I")};
    public boolean j2;
    public cc4 k2;
    public final ec4 l2;
    public af7 m2;
    public final ec4 n2;
    public cf7 o2;
    public final wbg p2;

    public gc4(Context context) {
        super(context, null);
        this.j2 = true;
        this.l2 = new ec4(this, 0);
        this.m2 = new n52(context, 4);
        this.n2 = new ec4(this, 1);
        this.p2 = new wbg(v7j.b(this));
        setLayoutManager(new LinearLayoutManager(0, false));
        h(new ph1(1), -1);
    }

    public static ArrayList G0(gc4 gc4Var) {
        gc4Var.getClass();
        ArrayList arrayList = new ArrayList();
        int childCount = gc4Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            tg8 tg8VarH0 = gc4Var.H0(i);
            if (tg8VarH0 != null) {
                arrayList.add(tg8VarH0);
            }
        }
        return arrayList;
    }

    private final tg8 getFirstEmptyInputController() {
        Object next;
        Iterator it = G0(this).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((pbg) ((tg8) next)).B().length() == 0) {
                return (tg8) next;
            }
        }
        next = null;
        return (tg8) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInputsEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            tg8 tg8VarH0 = H0(i);
            if (tg8VarH0 != null) {
                pbg pbgVar = (pbg) tg8VarH0;
                bc4 bc4Var = pbgVar.w;
                qbg qbgVar = pbgVar.x;
                if (!z && ((Boolean) qbgVar.f.invoke()).booleanValue()) {
                    ml9.d(bc4Var);
                }
                bc4Var.setClickable(z);
                bc4Var.setFocusable(z);
                bc4Var.setFocusableInTouchMode(z);
            }
        }
    }

    public final tg8 H0(int i) {
        Object objK = K(i);
        if (objK instanceof tg8) {
            return (tg8) objK;
        }
        return null;
    }

    public final void I0(int i, String str) {
        int length;
        if (i < 0 || i > getCountCells() || (length = str.length()) < 0 || length > getCountCells()) {
            return;
        }
        int length2 = str.length();
        for (int i2 = i; i2 < length2; i2++) {
            int i3 = i2 - i;
            tg8 tg8VarH0 = H0(i2);
            if (tg8VarH0 != null) {
                ((pbg) tg8VarH0).C(String.valueOf(r5h.R0(i3, str)));
            }
        }
    }

    public final boolean J0() {
        tg8 firstEmptyInputController = getFirstEmptyInputController();
        Boolean boolValueOf = firstEmptyInputController != null ? Boolean.valueOf(((pbg) firstEmptyInputController).w.requestFocus()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void K0() {
        tg8 firstEmptyInputController = getFirstEmptyInputController();
        if (firstEmptyInputController != null) {
            ml9.e(((pbg) firstEmptyInputController).w);
        }
    }

    public final int getCountCells() {
        zv8 zv8Var = q2[1];
        return ((Number) this.n2.b).intValue();
    }

    public final boolean getDisableInputsForError() {
        return this.j2;
    }

    public final cc4 getListener() {
        return this.k2;
    }

    public final cf7 getOnAnimationEnded() {
        return this.o2;
    }

    public final dc4 getState() {
        zv8 zv8Var = q2[0];
        return (dc4) this.l2.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        wbg wbgVar = this.p2;
        wbgVar.b();
        p3c p3cVar = wbgVar.d;
        zv8[] zv8VarArr = wbg.e;
        vo8 vo8Var = (vo8) p3cVar.m(wbgVar, zv8VarArr[1]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(wbgVar, zv8VarArr[1], null);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int iZ = oc9.Z(getState().a, pq3.j.h(this));
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            tg8 tg8VarH0 = H0(i);
            if (tg8VarH0 != null) {
                bc4 bc4Var = ((pbg) tg8VarH0).w;
                bc4 bc4Var2 = bc4Var != null ? bc4Var : null;
                if (bc4Var2 != null) {
                    bc4Var2.onThemeChanged(kbcVar);
                }
                bc4Var.setTextColor(iZ);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return J0();
    }

    public final void setCountCells(int i) {
        this.n2.B(this, q2[1], Integer.valueOf(i));
    }

    public final void setDisableInputsForError(boolean z) {
        this.j2 = z;
    }

    public final void setKeyboardOpen(af7 af7Var) {
        this.m2 = af7Var;
    }

    public final void setListener(cc4 cc4Var) {
        this.k2 = cc4Var;
    }

    public final void setOnAnimationEnded(cf7 cf7Var) {
        this.o2 = cf7Var;
    }

    public final void setSecure(boolean z) {
        nee adapter = getAdapter();
        qbg qbgVar = adapter instanceof qbg ? (qbg) adapter : null;
        if (qbgVar != null) {
            qbgVar.g.B(qbgVar, qbg.h[0], Boolean.valueOf(z));
        }
    }

    public final void setState(dc4 dc4Var) {
        this.l2.B(this, q2[0], dc4Var);
    }
}
