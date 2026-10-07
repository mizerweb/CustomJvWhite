package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ar;
import defpackage.bb7;
import defpackage.gr4;
import defpackage.hb7;
import defpackage.hr4;
import defpackage.j95;
import defpackage.oi8;
import defpackage.ore;
import defpackage.tl0;
import defpackage.vv;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/FragmentWrapperWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "fragmentId", "Ljava/lang/Class;", "Landroidx/fragment/app/a;", "fragmentClass", "", "fragmentTag", "Landroid/os/Bundle;", "args", "(ILjava/lang/Class;Ljava/lang/String;Landroid/os/Bundle;)V", "arch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FragmentWrapperWidget extends Widget {
    public static final /* synthetic */ zv8[] e = {new z8b(FragmentWrapperWidget.class, "fragmentId", "getFragmentId()I"), zo5.e(zfe.a, FragmentWrapperWidget.class, "fragmentClass", "getFragmentClass()Ljava/lang/String;"), new z8b(FragmentWrapperWidget.class, "fragmentTag", "getFragmentTag()Ljava/lang/String;"), new z8b(FragmentWrapperWidget.class, "fragmentArgs", "getFragmentArgs()Landroid/os/Bundle;")};
    public final vv a;
    public final vv b;
    public final vv c;
    public final vv d;

    public FragmentWrapperWidget() {
        super(null, 1, 0 == true ? 1 : 0);
        this.a = new vv("widget:fragment:id", Integer.class);
        Class<String> cls = String.class;
        this.b = new vv(":widget:fragment:class", cls);
        this.c = new vv("widget:fragment:tag", cls);
        this.d = new vv("widget:fragment:args", Bundle.class);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getC() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    public final hb7 o1() {
        Activity activity = getActivity();
        ar arVar = activity instanceof ar ? (ar) activity : null;
        if (arVar != null) {
            return arVar.p();
        }
        return null;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        a aVarP1 = p1();
        if (aVarP1 != null) {
            aVarP1.u(getContext());
        }
    }

    @Override // defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        hb7 hb7VarO1;
        a aVarP1;
        if (hr4Var.b || (hb7VarO1 = o1()) == null || (aVarP1 = p1()) == null) {
            return;
        }
        tl0 tl0Var = new tl0(hb7VarO1);
        tl0Var.g(aVarP1);
        tl0Var.d(true);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        zv8[] zv8VarArr = e;
        zv8 zv8Var = zv8VarArr[0];
        frameLayout.setId(((Number) this.a.a(this)).intValue());
        hb7 hb7VarO1 = o1();
        if (hb7VarO1 != null) {
            a aVarD = hb7VarO1.D(frameLayout.getId());
            zv8 zv8Var2 = zv8VarArr[1];
            String str = (String) this.b.a(this);
            if (aVarD == null) {
                bb7 bb7VarH = hb7VarO1.H();
                frameLayout.getContext().getClassLoader();
                a aVarA = bb7VarH.a(str);
                int i = aVarA.x;
                aVarA.x = i;
                aVarA.y = i;
                aVarA.z = aVarA.z;
                aVarA.t = hb7VarO1;
                aVarA.u = hb7VarO1.v;
                zv8 zv8Var3 = zv8VarArr[3];
                Bundle bundle2 = (Bundle) this.d.a(this);
                c cVar = aVarA.t;
                if (cVar != null && cVar.P()) {
                    ore.k("Fragment already added and state has been saved");
                    return null;
                }
                aVarA.f = bundle2;
                frameLayout.getContext();
                aVarA.B();
                tl0 tl0Var = new tl0(hb7VarO1);
                tl0Var.o = true;
                zv8 zv8Var4 = zv8VarArr[2];
                String str2 = (String) this.c.a(this);
                aVarA.H = frameLayout;
                aVarA.p = true;
                tl0Var.e(frameLayout.getId(), aVarA, str2);
                if (tl0Var.g) {
                    ore.k("This transaction is already being added to the back stack");
                    return null;
                }
                tl0Var.q.B(tl0Var, true);
                return frameLayout;
            }
        }
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        a aVarP1 = p1();
        if (aVarP1 != null) {
            aVarP1.x();
        }
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        a aVarP1 = p1();
        if (aVarP1 != null) {
            aVarP1.y();
        }
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        a aVarP1 = p1();
        if (aVarP1 != null) {
            aVarP1.z();
        }
    }

    public final a p1() {
        hb7 hb7VarO1 = o1();
        if (hb7VarO1 == null) {
            return null;
        }
        zv8 zv8Var = e[0];
        return hb7VarO1.D(((Number) this.a.a(this)).intValue());
    }

    public /* synthetic */ FragmentWrapperWidget(int i, Class cls, String str, Bundle bundle, int i2, j95 j95Var) {
        this(i, cls, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : bundle);
    }

    public FragmentWrapperWidget(int i, Class<? extends a> cls, String str, Bundle bundle) {
        this();
        vv vvVar = this.a;
        zv8[] zv8VarArr = e;
        zv8 zv8Var = zv8VarArr[0];
        vvVar.b(this, Integer.valueOf(i));
        String name = cls.getName();
        vv vvVar2 = this.b;
        zv8 zv8Var2 = zv8VarArr[1];
        vvVar2.b(this, name);
        vv vvVar3 = this.c;
        zv8 zv8Var3 = zv8VarArr[2];
        vvVar3.b(this, str);
        vv vvVar4 = this.d;
        zv8 zv8Var4 = zv8VarArr[3];
        vvVar4.b(this, bundle);
    }
}
