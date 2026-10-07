package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import one.me.pinbars.PinBarsWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class xzc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PinBarsWidget g;
    public final /* synthetic */ ViewGroup h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xzc(lq4 lq4Var, PinBarsWidget pinBarsWidget, ViewGroup viewGroup, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = pinBarsWidget;
        this.h = viewGroup;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ViewGroup viewGroup = this.h;
        PinBarsWidget pinBarsWidget = this.g;
        switch (i) {
            case 0:
                xzc xzcVar = new xzc(lq4Var, pinBarsWidget, viewGroup, 0);
                xzcVar.f = obj;
                return xzcVar;
            case 1:
                xzc xzcVar2 = new xzc(lq4Var, pinBarsWidget, viewGroup, 1);
                xzcVar2.f = obj;
                return xzcVar2;
            case 2:
                xzc xzcVar3 = new xzc(lq4Var, pinBarsWidget, viewGroup, 2);
                xzcVar3.f = obj;
                return xzcVar3;
            case 3:
                xzc xzcVar4 = new xzc(lq4Var, pinBarsWidget, viewGroup, 3);
                xzcVar4.f = obj;
                return xzcVar4;
            case 4:
                xzc xzcVar5 = new xzc(lq4Var, pinBarsWidget, viewGroup, 4);
                xzcVar5.f = obj;
                return xzcVar5;
            case 5:
                xzc xzcVar6 = new xzc(lq4Var, pinBarsWidget, viewGroup, 5);
                xzcVar6.f = obj;
                return xzcVar6;
            case 6:
                xzc xzcVar7 = new xzc(lq4Var, pinBarsWidget, viewGroup, 6);
                xzcVar7.f = obj;
                return xzcVar7;
            default:
                xzc xzcVar8 = new xzc(lq4Var, pinBarsWidget, viewGroup, 7);
                xzcVar8.f = obj;
                return xzcVar8;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((xzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((xzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((xzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((xzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((xzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((xzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((xzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((xzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

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
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        PinBarsWidget pinBarsWidget;
        v5c v5cVar;
        int i = this.e;
        int i2 = 8;
        int i3 = 2;
        a8g a8gVar = pq3.j;
        int i4 = 1;
        PinBarsWidget pinBarsWidget2 = this.g;
        sbi sbiVar = sbi.a;
        ViewGroup viewGroup = this.h;
        mza mzaVar = null;
        byte b = 0;
        byte b2 = 0;
        switch (i) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                x0d x0dVar = (x0d) obj2;
                AutoTransition autoTransition = pinBarsWidget2.r;
                if (x0dVar instanceof w0d) {
                    if (pinBarsWidget2.k == null) {
                        v5c v5cVar2 = new v5c(pinBarsWidget2.getContext(), ((w0d) x0dVar).e);
                        v5cVar2.setId(R.id.pinbars_message);
                        v5cVar2.setCloseButtonClickListener(new pzc(pinBarsWidget2, 9));
                        v5cVar2.setOnClickListener(new pzc(pinBarsWidget2, 10));
                        v5cVar2.setBackground(col.e(a8gVar.h(v5cVar2), null, ((fn8) a8gVar.h(v5cVar2).u().c.b).c, 4));
                        n1g.N(new uzc(1, null, pinBarsWidget2), v5cVar2);
                        pinBarsWidget2.k = v5cVar2;
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                        View view = pinBarsWidget2.k;
                        int childCount = viewGroup.getChildCount();
                        viewGroup.addView(view, childCount < 0 ? childCount : 0);
                        LinearLayout linearLayoutS1 = pinBarsWidget2.s1();
                        linearLayoutS1.setShowDividers(7);
                        linearLayoutS1.setDividerDrawable((ShapeDrawable) pinBarsWidget2.u.getValue());
                    }
                    v5c v5cVar3 = pinBarsWidget2.k;
                    if (v5cVar3 != null) {
                        w0d w0dVar = (w0d) x0dVar;
                        CharSequence charSequenceB = w0dVar.b.b(pinBarsWidget2.getContext());
                        if (charSequenceB == null) {
                            charSequenceB = "";
                        }
                        v5cVar3.setTitle(charSequenceB);
                        CharSequence charSequenceB2 = w0dVar.c.b(pinBarsWidget2.getContext());
                        v5cVar3.setSubtitle(charSequenceB2 != null ? charSequenceB2 : "");
                        v5cVar3.setCloseButtonVisibility(w0dVar.d);
                    }
                } else {
                    View viewFindViewById = viewGroup.findViewById(R.id.pinbars_message);
                    if (viewFindViewById != null) {
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                        viewGroup.removeView(viewFindViewById);
                    }
                    pinBarsWidget2.k = null;
                }
                return sbiVar;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                lza lzaVar = (lza) obj3;
                AutoTransition autoTransition2 = pinBarsWidget2.r;
                if (lzaVar instanceof kza) {
                    if (pinBarsWidget2.j == null) {
                        pinBarsWidget2.j = pinBarsWidget2.q1();
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition2);
                        View view2 = pinBarsWidget2.j;
                        int childCount2 = viewGroup.getChildCount();
                        if (1 <= childCount2) {
                            childCount2 = 1;
                        }
                        viewGroup.addView(view2, childCount2);
                    }
                    nza nzaVar = pinBarsWidget2.j;
                    if (nzaVar != null) {
                        kza kzaVar = (kza) lzaVar;
                        nzaVar.setIsPlaying(kzaVar.f);
                        nzaVar.setTitle(kzaVar.c.b(nzaVar.getContext()));
                        nzaVar.setSubtitle(kzaVar.d.b(nzaVar.getContext()));
                        int i5 = tzc.$EnumSwitchMapping$1[kzaVar.e.ordinal()];
                        if (i5 == 1) {
                            mzaVar = mza.a;
                        } else if (i5 == 2) {
                            mzaVar = mza.b;
                        } else if (i5 == 3) {
                            mzaVar = mza.c;
                        }
                        nzaVar.setPlaybackSpeed(mzaVar);
                        nzaVar.setProgress(((Number) pinBarsWidget2.t1().y.a.getValue()).floatValue());
                    }
                } else {
                    View viewFindViewById2 = viewGroup.findViewById(R.id.pinbars_miniplayer);
                    if (viewFindViewById2 != null) {
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition2);
                        viewGroup.removeView(viewFindViewById2);
                    }
                    pinBarsWidget2.j = null;
                }
                return sbiVar;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                fr7 fr7Var = (fr7) obj4;
                AutoTransition autoTransition3 = pinBarsWidget2.r;
                if (fr7Var instanceof dr7) {
                    if (pinBarsWidget2.m == null) {
                        gr7 gr7Var = new gr7(pinBarsWidget2.getContext());
                        gr7Var.setId(R.id.pinbars_group_call_bar);
                        gr7Var.setJoinAction(new rzc(pinBarsWidget2, i3));
                        pinBarsWidget2.m = gr7Var;
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition3);
                        viewGroup.addView(pinBarsWidget2.m, viewGroup.getChildCount());
                    }
                    gr7 gr7Var2 = pinBarsWidget2.m;
                    if (gr7Var2 != null) {
                        gr7Var2.u((dr7) fr7Var);
                    }
                } else {
                    View viewFindViewById3 = viewGroup.findViewById(R.id.pinbars_group_call_bar);
                    if (viewFindViewById3 != null) {
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition3);
                        viewGroup.removeView(viewFindViewById3);
                    }
                    pinBarsWidget2.m = null;
                }
                return sbiVar;
            case 3:
                Object obj5 = this.f;
                ch3.d0(obj);
                m99 m99Var = (m99) obj5;
                AutoTransition autoTransition4 = pinBarsWidget2.r;
                if (m99Var instanceof l99) {
                    View viewFindViewById4 = viewGroup.findViewById(R.id.pinbars_live_stream_bar);
                    if (viewFindViewById4 != null) {
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition4);
                        viewGroup.removeView(viewFindViewById4);
                    }
                    pinBarsWidget2.n = null;
                    return sbiVar;
                }
                if (!(m99Var instanceof k99)) {
                    ore.o();
                    return null;
                }
                if (pinBarsWidget2.n != null) {
                    return sbiVar;
                }
                n99 n99Var = new n99(pinBarsWidget2.getContext());
                n99Var.setId(R.id.pinbars_live_stream_bar);
                n99Var.setAction(new rzc(pinBarsWidget2, 0));
                pinBarsWidget2.n = n99Var;
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition4);
                viewGroup.addView(pinBarsWidget2.n, viewGroup.getChildCount());
                return sbiVar;
            case 4:
                Object obj6 = this.f;
                ch3.d0(obj);
                if8 if8Var = (if8) obj6;
                boolean z = if8Var instanceof gf8;
                PinBarsWidget pinBarsWidget3 = this.g;
                if (z) {
                    if (pinBarsWidget3.o == null) {
                        v5c v5cVar4 = new v5c(pinBarsWidget3.getContext(), ((Boolean) pinBarsWidget3.r1().u().i()).booleanValue() ? u5c.d : u5c.c);
                        v5cVar4.setId(R.id.pinbars_informer);
                        v5cVar4.setCloseButtonClickListener(new pzc(pinBarsWidget3, 11));
                        if (((Boolean) pinBarsWidget3.r1().u().i()).booleanValue()) {
                            a4m.c(v5cVar4, v5cVar4.getContentViews$pinbars());
                        }
                        v5cVar4.setBackground(col.e(a8gVar.h(v5cVar4), ((Boolean) pinBarsWidget3.r1().u().i()).booleanValue() ? null : new ColorDrawable(a8gVar.h(v5cVar4).b().d), ((fn8) a8gVar.h(v5cVar4).u().c.b).c, 4));
                        n1g.N(new uzc(0, null, pinBarsWidget3), v5cVar4);
                        if (v5cVar4.isAttachedToWindow()) {
                            gf8 gf8Var = (gf8) if8Var;
                            if (gf8Var.e) {
                                yab.i0(v7j.b(v5cVar4), null, 0, new awa((Object) v5cVar4, (lq4) (b == true ? 1 : 0), 29), 3);
                            }
                            nzc nzcVarT1 = pinBarsWidget3.t1();
                            String str = gf8Var.a;
                            ae8 ae8Var = nzcVarT1.z;
                            if (ae8Var != null) {
                                yab.i0(ae8Var.n, null, 0, new ue0(ae8Var, str, (lq4) null), 3);
                            }
                            pinBarsWidget = pinBarsWidget3;
                            v5cVar = v5cVar4;
                        } else {
                            tc4 tc4Var = new tc4(v5cVar4, if8Var, pinBarsWidget3, v5cVar4, 2);
                            v5cVar = v5cVar4;
                            pinBarsWidget = pinBarsWidget3;
                            v5cVar.addOnAttachStateChangeListener(tc4Var);
                        }
                        pinBarsWidget.o = v5cVar;
                        TransitionManager.beginDelayedTransition(viewGroup, pinBarsWidget.r);
                        View view3 = pinBarsWidget.o;
                        int childCount3 = viewGroup.getChildCount();
                        if (childCount3 >= 0) {
                            childCount3 = 0;
                        }
                        viewGroup.addView(view3, childCount3);
                        LinearLayout linearLayoutS2 = pinBarsWidget.s1();
                        linearLayoutS2.setShowDividers(0);
                        linearLayoutS2.setDividerDrawable((InsetDrawable) pinBarsWidget.t.getValue());
                        if (!((Boolean) pinBarsWidget.r1().u().i()).booleanValue()) {
                            linearLayoutS2.setBackgroundColor(a8gVar.h(linearLayoutS2).b().d);
                        }
                    } else {
                        pinBarsWidget = pinBarsWidget3;
                    }
                    v5c v5cVar5 = pinBarsWidget.o;
                    if (v5cVar5 != null) {
                        gf8 gf8Var2 = (gf8) if8Var;
                        CharSequence charSequenceB3 = gf8Var2.b.b(pinBarsWidget.getContext());
                        if (charSequenceB3 == null) {
                            charSequenceB3 = "";
                        }
                        CharSequence charSequenceB4 = gf8Var2.c.b(pinBarsWidget.getContext());
                        CharSequence charSequence = charSequenceB4 != null ? charSequenceB4 : "";
                        v5cVar5.setTitle(charSequenceB3);
                        v5cVar5.setSubtitle(charSequence);
                        v5cVar5.setIcon(gf8Var2.d);
                        v5cVar5.setCloseButtonVisibility(!gf8Var2.f);
                        v5cVar5.setOnClickListener(new qg3(pinBarsWidget, 2, if8Var));
                        v5cVar5.setContentDescription(((Object) charSequenceB3) + " " + ((Object) charSequence));
                    }
                } else {
                    zv8[] zv8VarArr = PinBarsWidget.z;
                    View viewFindViewById5 = viewGroup.findViewById(R.id.pinbars_informer);
                    if (viewFindViewById5 != null) {
                        TransitionManager.beginDelayedTransition(yab.L(viewGroup), (TransitionSet) pinBarsWidget3.s.getValue());
                        viewGroup.removeView(viewFindViewById5);
                    }
                    pinBarsWidget3.o = null;
                }
                return sbiVar;
            case 5:
                Object obj7 = this.f;
                ch3.d0(obj);
                dqc dqcVar = (dqc) obj7;
                AutoTransition autoTransition5 = pinBarsWidget2.r;
                if (dqcVar instanceof bqc) {
                    if (pinBarsWidget2.q == null) {
                        v5c v5cVar6 = new v5c(pinBarsWidget2.getContext(), u5c.e);
                        v5cVar6.setId(R.id.pinbars_pending_join_requests);
                        v5cVar6.setCloseButtonVisibility(true);
                        v5cVar6.setCloseButtonClickListener(new pzc(pinBarsWidget2, 2));
                        qe7.H(v5cVar6, 300L, new pzc(pinBarsWidget2, 3));
                        v5cVar6.setBackground(col.e(a8gVar.h(v5cVar6), null, ((fn8) a8gVar.h(v5cVar6).u().c.b).c, 4));
                        n1g.N(new vqa(7), v5cVar6);
                        pinBarsWidget2.q = v5cVar6;
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition5);
                        View view4 = pinBarsWidget2.q;
                        int iIndexOfChild = viewGroup.indexOfChild(viewGroup.findViewById(R.id.pinbars_message));
                        int i6 = iIndexOfChild >= 0 ? iIndexOfChild + 1 : 0;
                        int childCount4 = viewGroup.getChildCount();
                        if (i6 > childCount4) {
                            i6 = childCount4;
                        }
                        viewGroup.addView(view4, i6);
                        LinearLayout linearLayoutS3 = pinBarsWidget2.s1();
                        linearLayoutS3.setShowDividers(7);
                        linearLayoutS3.setDividerDrawable((ShapeDrawable) pinBarsWidget2.u.getValue());
                    }
                    v5c v5cVar7 = pinBarsWidget2.q;
                    if (v5cVar7 != null) {
                        CharSequence charSequenceB5 = ((bqc) dqcVar).a.b(v5cVar7.getContext());
                        v5cVar7.setTitle(charSequenceB5 != null ? charSequenceB5 : "");
                        v5cVar7.setCloseButtonVisibility(true);
                    }
                } else {
                    View viewFindViewById6 = viewGroup.findViewById(R.id.pinbars_pending_join_requests);
                    if (viewFindViewById6 != null) {
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition5);
                        viewGroup.removeView(viewFindViewById6);
                    }
                    pinBarsWidget2.q = null;
                }
                return sbiVar;
            case 6:
                Object obj8 = this.f;
                ch3.d0(obj);
                zv8[] zv8VarArr2 = PinBarsWidget.z;
                if (!((qke) obj8).a) {
                    View viewFindViewById7 = viewGroup.findViewById(R.id.pinbars_report_and_leave);
                    if (viewFindViewById7 != null) {
                        viewGroup.removeView(viewFindViewById7);
                        pinBarsWidget2.p = null;
                    }
                } else if (pinBarsWidget2.p == null) {
                    d5c d5cVar = new d5c(pinBarsWidget2.getContext());
                    d5cVar.setId(R.id.pinbars_report_and_leave);
                    d5cVar.setAppearance(new a5c());
                    d5cVar.setOnDeclineButtonClickListener(new pzc(pinBarsWidget2, 4));
                    d5cVar.setOnCloseButtonClickListener(new pzc(pinBarsWidget2, 5));
                    d5cVar.setBackground(col.e(a8gVar.h(d5cVar), null, ((fn8) a8gVar.h(d5cVar).u().c.b).c, 4));
                    n1g.N(new vqa(i2), d5cVar);
                    pinBarsWidget2.p = d5cVar;
                    int iIndexOfChild2 = viewGroup.indexOfChild(viewGroup.findViewById(R.id.pinbars_message));
                    int i7 = iIndexOfChild2 >= 0 ? iIndexOfChild2 + 1 : 0;
                    int childCount5 = viewGroup.getChildCount();
                    if (i7 > childCount5) {
                        i7 = childCount5;
                    }
                    viewGroup.addView(d5cVar, i7);
                }
                return sbiVar;
            default:
                Object obj9 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                AutoTransition autoTransition6 = pinBarsWidget2.r;
                if (zBooleanValue) {
                    if (pinBarsWidget2.l == null) {
                        gci gciVar = new gci(pinBarsWidget2.getContext());
                        gciVar.setId(R.id.unknown_contact);
                        gciVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        gciVar.setOnAddContactClickListener(new pzc(pinBarsWidget2, 6));
                        gciVar.setOnBlockContactClickListener(new pzc(pinBarsWidget2, 7));
                        if (((Boolean) pinBarsWidget2.r1().Z2.a(e5d.S6[209]).i()).booleanValue()) {
                            gciVar.setCloseButton(new pzc(pinBarsWidget2, 8));
                        }
                        gciVar.setBackground(col.e(a8gVar.h(gciVar), null, ((fn8) a8gVar.h(gciVar).u().c.b).c, 4));
                        n1g.N(new vzc((Object) pinBarsWidget2, (lq4) (b2 == true ? 1 : 0), i4), gciVar);
                        pinBarsWidget2.l = gciVar;
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition6);
                        View view5 = pinBarsWidget2.l;
                        int childCount6 = viewGroup.getChildCount();
                        viewGroup.addView(view5, childCount6 < 0 ? childCount6 : 0);
                    }
                    nzc nzcVarT2 = pinBarsWidget2.t1();
                    if (((f5d) ((wo6) nzcVarT2.g.getValue())).y()) {
                        ((lh4) nzcVarT2.h.getValue()).c();
                    }
                    v05 v05Var = nzcVarT2.l;
                    if (v05Var != null) {
                        v05Var.c();
                    }
                } else {
                    View viewFindViewById8 = viewGroup.findViewById(R.id.unknown_contact);
                    if (viewFindViewById8 != null) {
                        v05 v05Var2 = pinBarsWidget2.t1().l;
                        if (v05Var2 != null) {
                            v05Var2.d();
                        }
                        TransitionManager.beginDelayedTransition(viewGroup, autoTransition6);
                        viewGroup.removeView(viewFindViewById8);
                        pinBarsWidget2.l = null;
                    }
                }
                return sbiVar;
        }
    }
}
