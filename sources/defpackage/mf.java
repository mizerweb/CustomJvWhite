package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mf implements g5, iee, ze9, swi, xx0, mcg, j9j {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public mf(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.c = new nmc(8);
                break;
            case 11:
            default:
                this.c = new String[5];
                this.b = 0;
                break;
            case 12:
                this.c = new SparseArray();
                this.b = 0;
                break;
            case 13:
                break;
        }
    }

    public void A(List list, List list2) {
        Map map = (Map) this.c;
        int i = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object linkedHashSet = map.get(str);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                map.put(str, linkedHashSet);
            }
            Set set = (Set) linkedHashSet;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                set.add(new c87(i, str, (String) it2.next()));
            }
            set.add(new c87(i, str, null));
        }
        Object linkedHashSet2 = map.get(null);
        if (linkedHashSet2 == null) {
            linkedHashSet2 = new LinkedHashSet();
            map.put(null, linkedHashSet2);
        }
        Set set2 = (Set) linkedHashSet2;
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            set2.add(new c87(i, null, (String) it3.next()));
        }
    }

    @Override // defpackage.swi
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        n7b n7bVar = (n7b) this.c;
        n7bVar.f.execute(new i7b(n7bVar, 0, videoFrameProcessingException));
    }

    @Override // defpackage.ze9
    public void b(String str, af7 af7Var) {
        ((ze9) this.c).b(str, new za2(this, 26, af7Var));
    }

    @Override // defpackage.xx0
    public boolean c(String str) {
        return ((xx0) this.c).c(str);
    }

    public nf d() {
        hf hfVar = (hf) this.c;
        nf nfVar = new nf(hfVar.a, this.b);
        View view = hfVar.e;
        lf lfVar = nfVar.f;
        if (view != null) {
            lfVar.r = view;
        } else {
            CharSequence charSequence = hfVar.d;
            if (charSequence != null) {
                lfVar.d = charSequence;
                TextView textView = lfVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = hfVar.c;
            if (drawable != null) {
                lfVar.n = drawable;
                ImageView imageView = lfVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    lfVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = hfVar.f;
        if (charSequence2 != null) {
            hx0 hx0Var = hfVar.g;
            lfVar.getClass();
            Message messageObtainMessage = hx0Var != null ? lfVar.z.obtainMessage(-2, hx0Var) : null;
            lfVar.j = charSequence2;
            lfVar.k = messageObtainMessage;
        }
        if (hfVar.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) hfVar.b.inflate(lfVar.v, (ViewGroup) null);
            int i = hfVar.l ? lfVar.w : lfVar.x;
            ListAdapter kfVar = hfVar.i;
            if (kfVar == null) {
                kfVar = new kf(hfVar.a, i, R.id.text1, null);
            }
            lfVar.s = kfVar;
            lfVar.t = hfVar.m;
            if (hfVar.j != null) {
                alertController$RecycleListView.setOnItemClickListener(new gf(hfVar, lfVar));
            }
            if (hfVar.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            lfVar.e = alertController$RecycleListView;
        }
        View view2 = hfVar.k;
        if (view2 != null) {
            lfVar.f = view2;
            lfVar.g = false;
        }
        nfVar.setCancelable(true);
        nfVar.setCanceledOnTouchOutside(true);
        nfVar.setOnCancelListener(null);
        nfVar.setOnDismissListener(null);
        aca acaVar = hfVar.h;
        if (acaVar != null) {
            nfVar.setOnKeyListener(acaVar);
        }
        return nfVar;
    }

    @Override // defpackage.ze9
    public void f(String str, af7 af7Var) {
        ((ze9) this.c).f(str, new za2(this, 26, af7Var));
    }

    @Override // defpackage.j9j
    public i9j g(ybb ybbVar) {
        return new xde(this, ybbVar);
    }

    @Override // defpackage.j9j
    public ybb i(int i) {
        ybb ybbVar = (ybb) ((SparseArray) this.c).get(i);
        if (ybbVar != null) {
            return ybbVar;
        }
        ore.p(zo5.h(i, "Cannot find the wrapper for global view type "));
        return null;
    }

    @Override // defpackage.ze9
    public void j(String str, af7 af7Var) {
        ((ze9) this.c).j(str, new za2(this, 26, af7Var));
    }

    @Override // defpackage.ze9
    public void k(String str, af7 af7Var) {
        ((ze9) this.c).k(str, new za2(this, 26, af7Var));
    }

    @Override // defpackage.ze9
    public void m(String str, af7 af7Var) {
        ((ze9) this.c).m(str, new za2(this, 26, af7Var));
    }

    @Override // defpackage.xx0
    public e89 n(Uri uri) {
        return c4.r(((xx0) this.c).n(uri), new vuf(5, this));
    }

    @Override // defpackage.xx0
    public e89 o(b0a b0aVar) {
        e89 e89VarO = ((xx0) this.c).o(b0aVar);
        if (e89VarO == null) {
            return null;
        }
        return c4.r(e89VarO, new vuf(5, this));
    }

    @Override // defpackage.xx0
    public e89 p(byte[] bArr) {
        return c4.r(((xx0) this.c).p(bArr), new vuf(5, this));
    }

    public int q() {
        return Integer.max(0, ((int) ((((Date) this.c).getTime() + ((long) (this.b * 1000))) - new Date().getTime())) / 1000);
    }

    @Override // defpackage.ze9
    public void r(String str, af7 af7Var, af7 af7Var2) {
        ((ze9) this.c).r(str, new za2(this, 26, af7Var), af7Var2);
    }

    @Override // defpackage.ze9
    public void s(String str, af7 af7Var, af7 af7Var2) {
        ((ze9) this.c).s(str, new za2(this, 26, af7Var), af7Var2);
    }

    public long t(kj6 kj6Var) {
        nmc nmcVar = (nmc) this.c;
        int i = 0;
        kj6Var.u(0, nmcVar.a, 1);
        int i2 = nmcVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = np0.m;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        kj6Var.u(1, nmcVar.a, i4);
        while (i < i4) {
            i++;
            i5 = (nmcVar.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public String toString() {
        switch (this.a) {
            case 11:
                x88 x88Var = (x88) this.c;
                ArrayList arrayList = new ArrayList(x88Var.b);
                for (int i = 0; i < x88Var.b; i++) {
                    int iB = x88Var.b(i);
                    String str = vqi.a;
                    arrayList.add(new String(k4m.i(iB), StandardCharsets.US_ASCII));
                }
                StringBuilder sb = new StringBuilder("UnsupportedBrands{major=");
                int i2 = this.b;
                String str2 = vqi.a;
                sb.append(new String(k4m.i(i2), StandardCharsets.US_ASCII));
                sb.append(", compatible=");
                sb.append(arrayList);
                sb.append("}");
                return sb.toString();
            case 12:
            default:
                return super.toString();
            case 13:
                return "Ticket, creation date = " + ((Date) this.c) + ", ticket lifetime = " + this.b + (q() > 0 ? c0a.k(q(), " (still valid for ", " seconds)") : " (not valid anymore)");
        }
    }

    @Override // defpackage.iee
    public boolean u(UnsatisfiedLinkError unsatisfiedLinkError, rcg[] rcgVarArr) {
        int i;
        iee[] ieeVarArr;
        do {
            i = this.b;
            ieeVarArr = (iee[]) this.c;
            if (i >= 6) {
                return false;
            }
            this.b = i + 1;
        } while (!ieeVarArr[i].u(unsatisfiedLinkError, rcgVarArr));
        return true;
    }

    @Override // defpackage.swi
    public void v() {
        n7b n7bVar = (n7b) this.c;
        int i = this.b;
        df5 df5Var = n7bVar.p;
        df5Var.getClass();
        synchronized (df5Var) {
            try {
                lvb.b0(vqi.l(df5Var.f, i));
                boolean z = false;
                lvb.b0(df5Var.o != -1);
                ((cf5) df5Var.f.get(i)).b = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= df5Var.f.size()) {
                        z = true;
                        break;
                    } else if (!((cf5) df5Var.f.valueAt(i2)).b) {
                        break;
                    } else {
                        i2++;
                    }
                }
                df5Var.g = z;
                if (((cf5) df5Var.f.get(df5Var.o)).a.isEmpty()) {
                    if (i == df5Var.o) {
                        df5Var.c();
                    }
                    if (z) {
                        df5Var.a.B();
                        return;
                    }
                }
                if (i != df5Var.o && ((cf5) df5Var.f.get(i)).a.size() == 1) {
                    df5Var.e.q(new ye5(df5Var, 2), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean w(String str) {
        for (String str2 : (String[]) this.c) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        x(sb);
        Log.w("SoLoader", sb.toString());
        String[] strArr = (String[]) this.c;
        int i = this.b;
        strArr[i % strArr.length] = str;
        this.b = i + 1;
        return true;
    }

    public synchronized void x(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.b);
            sb.append(" base apk paths.");
            if (this.b > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = (String[]) this.c;
                if (i < strArr.length) {
                    int i2 = (this.b - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ze9
    public void y(af7 af7Var, af7 af7Var2) {
        ((ze9) this.c).y(new za2(this, 26, af7Var), af7Var2);
    }

    @Override // defpackage.g5
    public boolean z(View view) {
        ((BottomSheetBehavior) this.c).C(this.b);
        return true;
    }

    public /* synthetic */ mf(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public mf(iee[] ieeVarArr) {
        this.a = 4;
        this.c = ieeVarArr;
        this.b = 0;
    }

    public /* synthetic */ mf(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    public mf(int i, int[] iArr) {
        x88 x88Var;
        this.a = 11;
        this.b = i;
        if (iArr != null) {
            x88 x88Var2 = x88.c;
            x88Var = iArr.length == 0 ? x88.c : new x88(Arrays.copyOf(iArr, iArr.length));
        } else {
            x88Var = x88.c;
        }
        this.c = x88Var;
    }

    public mf(Context context) {
        this.a = 0;
        int i = nf.i(context, 0);
        this.c = new hf(new ContextThemeWrapper(context, nf.i(context, i)));
        this.b = i;
    }
}
