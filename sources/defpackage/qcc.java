package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class qcc extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ rcc d;

    /* JADX WARN: Illegal instructions before constructor call */
    public qcc(rcc rccVar, int i) {
        this.c = i;
        ybc ybcVar = ybc.a;
        int i2 = 4;
        switch (i) {
            case 2:
                this.d = rccVar;
                super(i2, ybcVar);
                break;
            case 3:
                this.d = rccVar;
                super(i2, ybcVar);
                break;
            case 4:
            default:
                this.d = rccVar;
                super(i2, gcc.Compact);
                break;
            case 5:
                Boolean bool = Boolean.FALSE;
                this.d = rccVar;
                super(i2, bool);
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        ViewGroup viewGroup;
        cyb cybVar;
        ViewGroup viewGroup2;
        m5c m5cVar;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int i = this.c;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        rcc rccVar = this.d;
        switch (i) {
            case 0:
                kbc kbcVarH = (kbc) obj2;
                if (!cqk.d((kbc) obj, kbcVarH)) {
                    if (kbcVarH == null) {
                        kbcVarH = pq3.j.h(rccVar);
                    }
                    rccVar.onThemeChanged(kbcVarH);
                }
                break;
            case 1:
                if (((gcc) obj) != ((gcc) obj2)) {
                    rccVar.u();
                    rccVar.t();
                    if (!rccVar.l()) {
                        rccVar.requestLayout();
                    }
                }
                break;
            case 2:
                dcc dccVar = (dcc) obj2;
                if (!cqk.d((dcc) obj, dccVar)) {
                    rcc.f(rccVar, dccVar);
                    rccVar.t();
                    if (!rccVar.l()) {
                        rccVar.requestLayout();
                    }
                }
                break;
            case 3:
                final bcc bccVar = (bcc) obj2;
                bcc bccVar2 = (bcc) obj;
                if ((rccVar.getForm() == gcc.Compact || rccVar.getForm() == gcc.Chat || rccVar.getForm() == gcc.ChatPreview) && !cqk.d(bccVar2, bccVar)) {
                    rccVar.removeView(rccVar.o);
                    Context context = rccVar.getContext();
                    kbc customTheme = rccVar.getCustomTheme();
                    boolean z = bccVar instanceof wbc;
                    zxb zxbVar = zxb.GHOST;
                    Rect rectY = null;
                    if (z) {
                        wbc wbcVar = (wbc) bccVar;
                        String str = wbcVar.a;
                        if (str != null) {
                            m5cVar = new m5c(context);
                            m5cVar.setMode(j5c.b);
                            m5cVar.a(wbcVar.b, R.drawable.icon_arrow_left, str);
                            qe7.H(m5cVar, 300L, new View.OnClickListener() { // from class: cvh
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = i2;
                                    bcc bccVar3 = bccVar;
                                    switch (i6) {
                                        case 0:
                                            ((wbc) bccVar3).c.invoke(view);
                                            break;
                                        case 1:
                                            ((xbc) bccVar3).a.invoke(view);
                                            break;
                                        case 2:
                                            ((ecc) bccVar3).c.invoke(view);
                                            break;
                                        default:
                                            ((wbc) bccVar3).c.invoke(view);
                                            break;
                                    }
                                }
                            });
                        } else {
                            cybVar = new cyb(context);
                            cybVar.setCustomTheme(customTheme);
                            cybVar.setSize(ayb.i);
                            cybVar.setAppearance(zxbVar);
                            cybVar.setIconResource(R.drawable.icon_arrow_left);
                            qe7.H(cybVar, 300L, new View.OnClickListener() { // from class: cvh
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = i5;
                                    bcc bccVar3 = bccVar;
                                    switch (i6) {
                                        case 0:
                                            ((wbc) bccVar3).c.invoke(view);
                                            break;
                                        case 1:
                                            ((xbc) bccVar3).a.invoke(view);
                                            break;
                                        case 2:
                                            ((ecc) bccVar3).c.invoke(view);
                                            break;
                                        default:
                                            ((wbc) bccVar3).c.invoke(view);
                                            break;
                                    }
                                }
                            });
                            viewGroup = cybVar;
                        }
                    } else {
                        if (bccVar instanceof xbc) {
                            cybVar = new cyb(context);
                            cybVar.setCustomTheme(customTheme);
                            cybVar.setSize(ayb.i);
                            cybVar.setAppearance(zxbVar);
                            cybVar.setIconResource(R.drawable.icon_cross);
                            qe7.H(cybVar, 300L, new View.OnClickListener() { // from class: cvh
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = i4;
                                    bcc bccVar3 = bccVar;
                                    switch (i6) {
                                        case 0:
                                            ((wbc) bccVar3).c.invoke(view);
                                            break;
                                        case 1:
                                            ((xbc) bccVar3).a.invoke(view);
                                            break;
                                        case 2:
                                            ((ecc) bccVar3).c.invoke(view);
                                            break;
                                        default:
                                            ((wbc) bccVar3).c.invoke(view);
                                            break;
                                    }
                                }
                            });
                        } else if (bccVar instanceof ecc) {
                            cybVar = new cyb(context);
                            cybVar.setCustomTheme(customTheme);
                            cybVar.setSize(ayb.i);
                            cybVar.setAppearance(zxbVar);
                            ecc eccVar = (ecc) bccVar;
                            cybVar.setText(eccVar.a);
                            Integer num = eccVar.b;
                            if (num != null) {
                                cybVar.setTextColor(Integer.valueOf(num.intValue()));
                            }
                            qe7.H(cybVar, 300L, new View.OnClickListener() { // from class: cvh
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = i3;
                                    bcc bccVar3 = bccVar;
                                    switch (i6) {
                                        case 0:
                                            ((wbc) bccVar3).c.invoke(view);
                                            break;
                                        case 1:
                                            ((xbc) bccVar3).a.invoke(view);
                                            break;
                                        case 2:
                                            ((ecc) bccVar3).c.invoke(view);
                                            break;
                                        default:
                                            ((wbc) bccVar3).c.invoke(view);
                                            break;
                                    }
                                }
                            });
                        } else if (!(bccVar instanceof zbc)) {
                            if (!(bccVar instanceof ybc)) {
                                ore.o();
                            } else {
                                viewGroup = null;
                            }
                            break;
                        } else {
                            hcc hccVar = ((zbc) bccVar).a;
                            cybVar = new cyb(context);
                            cybVar.setCustomTheme(customTheme);
                            cybVar.setSize(ayb.i);
                            cybVar.setAppearance(zxbVar);
                            Integer num2 = hccVar.c;
                            if (num2 != null) {
                                cybVar.setIconColor(Integer.valueOf(num2.intValue()));
                            }
                            cybVar.setIconResource(hccVar.a);
                            if (hccVar.b) {
                                cybVar.setOnClickListener(new evh(hccVar, 0));
                            } else {
                                qe7.H(cybVar, 300L, new evh(hccVar, 1));
                            }
                        }
                        viewGroup = cybVar;
                    }
                    if (viewGroup != null) {
                        viewGroup = m5cVar;
                        viewGroup.setId(R.id.oneme_left_icon_button);
                        viewGroup2 = viewGroup;
                    } else {
                        viewGroup = m5cVar;
                        viewGroup2 = null;
                    }
                    rccVar.o = viewGroup2;
                    if (viewGroup2 != null) {
                        rccVar.addView(viewGroup2);
                        rectY = qyj.y(viewGroup2, gm0.K(40.0f * yl5.d().getDisplayMetrics().density), gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
                    }
                    rccVar.s = rectY;
                    rccVar.t();
                    if (!rccVar.l()) {
                        rccVar.requestLayout();
                    }
                }
                break;
            case 4:
                ylc ylcVar = (ylc) obj2;
                int iOrdinal = rccVar.getForm().ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        iIntValue = ylcVar != null ? ((Number) ylcVar.a).intValue() : gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        iIntValue2 = ylcVar != null ? ((Number) ylcVar.b).intValue() : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                    } else if (iOrdinal == 2) {
                        iIntValue3 = ylcVar != null ? ((Number) ylcVar.a).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                        iIntValue4 = ylcVar != null ? ((Number) ylcVar.b).intValue() : gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                    } else if (iOrdinal != 3) {
                        ore.o();
                    } else {
                        iIntValue4 = 0;
                        iIntValue3 = 0;
                    }
                    rccVar.setPadding(iIntValue3, 0, iIntValue4, 0);
                } else {
                    iIntValue = ylcVar != null ? ((Number) ylcVar.a).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                    iIntValue2 = ylcVar != null ? ((Number) ylcVar.b).intValue() : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                }
                iIntValue3 = iIntValue;
                iIntValue4 = iIntValue2;
                rccVar.setPadding(iIntValue3, 0, iIntValue4, 0);
                break;
            default:
                ny8 ny8Var = rccVar.h;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue) {
                    rccVar.t();
                }
                if (ny8Var.d()) {
                    ((v0g) ny8Var.getValue()).a(zBooleanValue);
                    rccVar.v();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qcc(rcc rccVar, int i, boolean z) {
        super(4, null);
        this.c = i;
        this.d = rccVar;
    }
}
