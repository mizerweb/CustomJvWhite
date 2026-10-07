package defpackage;

import android.R;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.text.Spannable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import one.me.chats.tab.ChatsTabWidget;

/* JADX INFO: loaded from: classes.dex */
public class p3c implements ti, uwa, f96, l8e, o4d, u9, aqg, x7h, g5, lnk {
    public static final int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public final /* synthetic */ int a;
    public Object b;

    public p3c(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new s74(1);
                break;
            case 7:
                break;
            case 10:
                this.b = new ArrayList(20);
                break;
            case 16:
                this.b = new khb(21);
                break;
            case 18:
                this.b = new v56(100);
                break;
            default:
                this.b = p3c.class.getName();
                break;
        }
    }

    public static boolean u(Spannable spannable, int i, int i2, String str) {
        if (i2 - i >= str.length()) {
            int length = str.length();
            for (int i3 = 0; i3 < length; i3++) {
                if (tre.U(spannable.charAt(i + i3), str.charAt(i3), true)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.f96
    public boolean A() {
        ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
        zv8[] zv8VarArr = ChatsTabWidget.B1;
        return chatsTabWidget.B1().B().d();
    }

    @Override // defpackage.l8e
    public void B(Object obj, zv8 zv8Var, Object obj2) {
        vo8 vo8Var = (vo8) ((AtomicReference) this.b).accumulateAndGet((vo8) obj2, new cu4());
        if (vo8Var != null) {
            vo8Var.start();
        }
    }

    @Override // defpackage.aqg
    public void R(vpg vpgVar, int i) {
        Character chG = G(i);
        c09 c09Var = (c09) vpgVar;
        if (chG != null) {
            c09Var.a(chG.charValue());
        } else {
            c09Var.b();
        }
    }

    @Override // defpackage.x7h
    public boolean a(b87 b87Var) {
        String str = b87Var.n;
        return ((khb) this.b).a(b87Var) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
    }

    @Override // defpackage.uwa
    public InputStream b(String str) {
        try {
            return ((AssetManager) this.b).open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.u9
    public void c(Object obj) {
        Map map = (Map) obj;
        c cVar = (c) this.b;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        db7 db7Var = (db7) cVar.E.pollFirst();
        if (db7Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = db7Var.a;
        int i2 = db7Var.b;
        a aVarC = cVar.c.c(str);
        if (aVarC != null) {
            aVarC.F(i2, strArr, iArr);
            return;
        }
        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
    }

    public void d(int i, boolean z) {
        s74 s74Var = (s74) this.b;
        if (z) {
            s74Var.a(i);
        } else {
            s74Var.getClass();
        }
    }

    @Override // defpackage.x7h
    public w7h e(b87 b87Var) {
        khb khbVar = (khb) this.b;
        String str = b87Var.n;
        int i = b87Var.K;
        if (str != null) {
            switch (str) {
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new jo2(str, i);
                case "application/cea-708":
                    return new no2(i, b87Var.q);
            }
        }
        if (!khbVar.a(b87Var)) {
            ore.p(qv1.k("Attempted to create decoder for unsupported MIME type: ", str));
            return null;
        }
        d8h d8hVarM = khbVar.m(b87Var);
        d8hVarM.getClass().getSimpleName().concat("Decoder");
        return new mec(d8hVarM);
    }

    @Override // defpackage.o4d
    public m4d g(ArrayList arrayList) {
        return new mg6((oo3) this.b, arrayList);
    }

    public hu7 h() {
        return new hu7((String[]) ((ArrayList) this.b).toArray(new String[0]));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // defpackage.aqg
    /* JADX INFO: renamed from: i */
    public Character G(int i) {
        CharSequence charSequence;
        char upperCase;
        if (i < 0 || (charSequence = (CharSequence) ((cf7) this.b).invoke(Integer.valueOf(i))) == null) {
            return null;
        }
        Character chP0 = r5h.P0(charSequence);
        if (chP0 == null) {
            upperCase = '#';
        } else {
            Character ch = Character.isLetter(chP0.charValue()) ? chP0 : null;
            if (ch != null) {
                upperCase = Character.toUpperCase(ch.charValue());
            } else {
                upperCase = '#';
            }
        }
        return Character.valueOf(upperCase);
    }

    public void j() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public boolean k(Spannable spannable, cf7 cf7Var) {
        String str = (String) this.b;
        try {
            return ((Boolean) cf7Var.invoke(spannable)).booleanValue();
        } catch (Throwable th) {
            if (!(th instanceof ArrayIndexOutOfBoundsException)) {
                gm0.X(str, new qk2(th), "LinkifyCompat.addLinks with pattern failed", new Object[0]);
                return false;
            }
            try {
                return ((Boolean) cf7Var.invoke((Spannable) tre.z0(spannable))).booleanValue();
            } catch (Throwable th2) {
                gm0.X(str, new qk2(th2), "LinkifyCompat.addLinks with pattern text.safeCopy() failed", new Object[0]);
                return false;
            }
        }
    }

    public boolean l(CharSequence charSequence, kuc kucVar) {
        String str = kucVar.b;
        if (str.length() != 0) {
            Matcher matcher = ((v56) this.b).D(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        return (vo8) ((AtomicReference) this.b).get();
    }

    public void n(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // defpackage.f96
    public void o() {
        ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
        zv8[] zv8VarArr = ChatsTabWidget.B1;
        iug iugVarB1 = chatsTabWidget.B1();
        iugVarB1.getClass();
        a8j.t(iugVarB1, null, new fpf(iugVarB1, null, 4), 3);
    }

    @Override // defpackage.aqg
    public vpg p(ViewGroup viewGroup) {
        return new c09(new AppCompatTextView(viewGroup.getContext(), null, 0));
    }

    public void q(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void r() {
        dxe dxeVar = (dxe) ((ny8) this.b).getValue();
        String str = dxeVar.l;
        gm0.x(str, "execute", null);
        Object objC = ((hr2) dxeVar.n.getValue()).c(sbi.a);
        if (objC instanceof bs2) {
            gm0.Y(str, "tasksQueue is closed!");
        } else if (objC instanceof cs2) {
            gm0.V(str, "tasksQueue result if failure!", ds2.a(objC));
        }
    }

    public void s(String str, String str2) {
        e9i.u(str);
        e9i.x(str2, str);
        n(str);
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(str);
        arrayList.add(r5h.y1(str2).toString());
    }

    public void t() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new qw8(viewFindViewById, 1));
    }

    public String toString() {
        switch (this.a) {
            case 4:
                long j = ((AtomicLong) this.b).get();
                tre.M(2);
                return r5h.c1(Long.toString(j, 2), 64, '0');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ti
    public si x(gj gjVar, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new ou7(15);
        }
        return new si(animatedFactoryV2Impl.g, gjVar, rect, animatedFactoryV2Impl.d);
    }

    @Override // defpackage.g5
    public boolean z(View view) {
        gvb gvbVar = (gvb) this.b;
        int currentItem = ((y8j) view).getCurrentItem() + 1;
        y8j y8jVar = (y8j) gvbVar.a;
        if (y8jVar.r) {
            y8jVar.i(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.lnk
    public Object zza() {
        z8l z8lVar = (z8l) ((lnk) this.b).zza();
        if (z8lVar != null) {
            return z8lVar;
        }
        ore.n("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public /* synthetic */ p3c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public p3c(long j) {
        this.a = 4;
        this.b = new AtomicLong(j);
    }

    public p3c(String str, yre yreVar) {
        this.a = 19;
        this.b = new yre(2, yreVar);
    }

    public p3c(tqi tqiVar) {
        this.a = 23;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), tqiVar);
    }

    public p3c(h5 h5Var) {
        this.a = 20;
        this.b = h5Var.d(661);
    }
}
