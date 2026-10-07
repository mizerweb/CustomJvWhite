package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class rs2 extends evb {
    public final n67 h;
    public final aac i;
    public final ViewGroup j;
    public final ny8 k;
    public f92 l;
    public final tnh m;
    public final wub n;

    public rs2(n67 n67Var, aac aacVar, ViewGroup viewGroup, ps2 ps2Var, ny8 ny8Var, ny8 ny8Var2, v09 v09Var, g19 g19Var) {
        super(ny8Var, v09Var, g19Var, ps2Var);
        this.h = n67Var;
        this.i = aacVar;
        this.j = viewGroup;
        this.k = ny8Var2;
        this.m = new tnh(R.string.chat_list_channels_folder_highlight_title);
        this.n = new wub(tub.a, sub.c);
    }

    public static ugh m(xgh xghVar, String str) {
        owb tabItem;
        if (str != null && str.length() != 0) {
            int tabCount = xghVar.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                ugh ughVarH = xghVar.h(i);
                View view = ughVarH != null ? ughVarH.b : null;
                z9c z9cVar = view instanceof z9c ? (z9c) view : null;
                if (cqk.d((z9cVar == null || (tabItem = z9cVar.getTabItem()) == null) ? null : tabItem.a, str)) {
                    return ughVarH;
                }
            }
        }
        return null;
    }

    @Override // defpackage.evb
    public final void b(boolean z) {
        f92 f92Var = this.l;
        aac aacVar = this.i;
        if (f92Var != null) {
            aacVar.removeCallbacks(f92Var);
            this.l = null;
        }
        aacVar.setOnScrollChangeListener(null);
        n67 n67Var = this.h;
        if (n67Var.l) {
            n67Var.l = false;
            if (!n67Var.g.isEmpty()) {
                n67Var.j(n67Var.g);
            }
        }
        super.b(z);
    }

    @Override // defpackage.evb
    public final View c() {
        return this.i;
    }

    @Override // defpackage.evb
    public final ViewGroup d() {
        return this.j;
    }

    @Override // defpackage.evb
    public final wub e() {
        return this.n;
    }

    @Override // defpackage.evb
    public final ynh f() {
        return this.m;
    }

    @Override // defpackage.evb
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.evb
    public final void i() {
        b(true);
        oub oubVar = this.a;
        oubVar.f();
        ae9 ae9Var = (ae9) this.k.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("tooltip_id", ((ps2) oubVar).i.b);
        ae9.k(ae9Var, "TOOLTIP", "tooltip_close", ul9Var.b(), 8);
    }

    @Override // defpackage.evb
    public final void j() {
        f92 f92Var = this.l;
        if (f92Var != null) {
            this.i.removeCallbacks(f92Var);
            this.l = null;
        }
        super.j();
    }

    @Override // defpackage.evb
    public final void k() {
        oub oubVar = this.a;
        r17 r17VarI = ((ps2) oubVar).i();
        String str = r17VarI != null ? r17VarI.a : null;
        aac aacVar = this.i;
        ugh ughVarM = m(aacVar, str);
        if (ughVarM != null) {
            aacVar.n(ughVarM, true);
        }
        b(true);
        oubVar.f();
        ae9 ae9Var = (ae9) this.k.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("tooltip_id", ((ps2) oubVar).i.b);
        ae9.k(ae9Var, "TOOLTIP", "tooltip_click", ul9Var.b(), 8);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.evb
    public final boolean l() {
        wgh wghVar;
        int iV;
        if (!this.d && !h()) {
            r17 r17VarI = ((ps2) this.a).i();
            String str = r17VarI != null ? r17VarI.a : null;
            aac aacVar = this.i;
            ugh ughVarM = m(aacVar, str);
            if (ughVarM != null && (wghVar = ughVarM.d) != null) {
                this.h.l = true;
                int width = aacVar.getWidth();
                if (width <= 0) {
                    n(wghVar);
                } else {
                    int scrollX = aacVar.getScrollX();
                    int left = wghVar.getLeft();
                    int width2 = wghVar.getWidth() + left;
                    if (left < scrollX || width2 > scrollX + width) {
                        int width3 = aacVar.getWidth();
                        if (width3 <= 0) {
                            iV = aacVar.getScrollX();
                        } else {
                            View childAt = aacVar.getChildAt(0);
                            int width4 = childAt != null ? childAt.getWidth() : width3;
                            if (width4 < width3) {
                                width4 = width3;
                            }
                            int i = width4 - width3;
                            if (i < 0) {
                                i = 0;
                            }
                            iV = oc9.v(((wghVar.getWidth() / 2) + wghVar.getLeft()) - (width3 / 2), 0, i);
                        }
                        aacVar.smoothScrollTo(iV, 0);
                        f92 f92Var = new f92(this, 13, wghVar);
                        this.l = f92Var;
                        aacVar.postDelayed(f92Var, 300L);
                    } else {
                        n(wghVar);
                    }
                }
                ((pa4) this.f.getValue()).a(pa4.d, (oa4) this.g.getValue());
                aacVar.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: qs2
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                        rs2 rs2Var = this.a;
                        if (rs2Var.h()) {
                            rs2Var.b(true);
                            ((ps2) rs2Var.a).f();
                        }
                    }
                });
                return true;
            }
            gm0.n(this.b, "no view by this channel folder");
        }
        return false;
    }

    public final void n(View view) {
        a(view);
        if (h()) {
            ae9 ae9Var = (ae9) this.k.getValue();
            ul9 ul9Var = new ul9();
            ul9Var.put("tooltip_id", ((ps2) this.a).i.b);
            ae9.k(ae9Var, "TOOLTIP", "tooltip_show", ul9Var.b(), 8);
        }
    }
}
