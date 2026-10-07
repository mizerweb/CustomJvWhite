package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import java.util.EnumMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class w5f extends LinearLayout implements eph {
    public static final AccelerateDecelerateInterpolator k = new AccelerateDecelerateInterpolator();
    public final String a;
    public af7 b;
    public final ny8 c;
    public af7 d;
    public final ny8 e;
    public af7 f;
    public final ny8 g;
    public final EnumMap h;
    public final EnumMap i;
    public final EnumMap j;

    public w5f(final Context context) {
        super(context);
        this.a = w5f.class.getName();
        int i = 22;
        this.b = new tyd(i);
        final int i2 = 0;
        this.c = rx8.P(3, new af7() { // from class: p5f
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                final w5f w5fVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        j5f j5fVar = new j5f(context2);
                        j5fVar.setId(R.id.messages_list_scroll_new_message);
                        j5fVar.setImageDrawable$message_list(j5fVar.getContext().getDrawable(R.drawable.icon_chevron_down_mini).mutate());
                        final int i4 = 2;
                        qe7.H(j5fVar, 300L, new View.OnClickListener() { // from class: o5f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i5 = i4;
                                w5f w5fVar2 = w5fVar;
                                switch (i5) {
                                    case 0:
                                        w5fVar2.f.invoke();
                                        break;
                                    case 1:
                                        w5fVar2.d.invoke();
                                        break;
                                    default:
                                        w5fVar2.b.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams = j5fVar.getLayoutParams();
                        if (layoutParams == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        j5fVar.setLayoutParams(marginLayoutParams);
                        return j5fVar;
                    case 1:
                        j5f j5fVar2 = new j5f(context2);
                        j5fVar2.setId(R.id.messages_list_scroll_mention);
                        j5fVar2.setImageDrawable$message_list(j5fVar2.getContext().getDrawable(R.drawable.icon_mention).mutate());
                        final int i5 = 1;
                        qe7.H(j5fVar2, 300L, new View.OnClickListener() { // from class: o5f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i6 = i5;
                                w5f w5fVar2 = w5fVar;
                                switch (i6) {
                                    case 0:
                                        w5fVar2.f.invoke();
                                        break;
                                    case 1:
                                        w5fVar2.d.invoke();
                                        break;
                                    default:
                                        w5fVar2.b.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams2 = j5fVar2.getLayoutParams();
                        if (layoutParams2 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        j5fVar2.setLayoutParams(marginLayoutParams2);
                        return j5fVar2;
                    default:
                        j5f j5fVar3 = new j5f(context2);
                        j5fVar3.setId(R.id.messages_list_scroll_reaction);
                        j5fVar3.setImageDrawable$message_list(j5fVar3.getContext().getDrawable(R.drawable.icon_heart).mutate());
                        final int i6 = 0;
                        qe7.H(j5fVar3, 300L, new View.OnClickListener() { // from class: o5f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i7 = i6;
                                w5f w5fVar2 = w5fVar;
                                switch (i7) {
                                    case 0:
                                        w5fVar2.f.invoke();
                                        break;
                                    case 1:
                                        w5fVar2.d.invoke();
                                        break;
                                    default:
                                        w5fVar2.b.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams3 = j5fVar3.getLayoutParams();
                        if (layoutParams3 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        j5fVar3.setLayoutParams(marginLayoutParams3);
                        return j5fVar3;
                }
            }
        });
        this.d = new tyd(i);
        final int i3 = 1;
        this.e = rx8.P(3, new af7() { // from class: p5f
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                final w5f w5fVar = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        j5f j5fVar = new j5f(context2);
                        j5fVar.setId(R.id.messages_list_scroll_new_message);
                        j5fVar.setImageDrawable$message_list(j5fVar.getContext().getDrawable(R.drawable.icon_chevron_down_mini).mutate());
                        final int i5 = 2;
                        qe7.H(j5fVar, 300L, new View.OnClickListener() { // from class: o5f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i7 = i5;
                                w5f w5fVar2 = w5fVar;
                                switch (i7) {
                                    case 0:
                                        w5fVar2.f.invoke();
                                        break;
                                    case 1:
                                        w5fVar2.d.invoke();
                                        break;
                                    default:
                                        w5fVar2.b.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams = j5fVar.getLayoutParams();
                        if (layoutParams == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        j5fVar.setLayoutParams(marginLayoutParams);
                        return j5fVar;
                    case 1:
                        j5f j5fVar2 = new j5f(context2);
                        j5fVar2.setId(R.id.messages_list_scroll_mention);
                        j5fVar2.setImageDrawable$message_list(j5fVar2.getContext().getDrawable(R.drawable.icon_mention).mutate());
                        final int i6 = 1;
                        qe7.H(j5fVar2, 300L, new View.OnClickListener() { // from class: o5f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i7 = i6;
                                w5f w5fVar2 = w5fVar;
                                switch (i7) {
                                    case 0:
                                        w5fVar2.f.invoke();
                                        break;
                                    case 1:
                                        w5fVar2.d.invoke();
                                        break;
                                    default:
                                        w5fVar2.b.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams2 = j5fVar2.getLayoutParams();
                        if (layoutParams2 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        j5fVar2.setLayoutParams(marginLayoutParams2);
                        return j5fVar2;
                    default:
                        j5f j5fVar3 = new j5f(context2);
                        j5fVar3.setId(R.id.messages_list_scroll_reaction);
                        j5fVar3.setImageDrawable$message_list(j5fVar3.getContext().getDrawable(R.drawable.icon_heart).mutate());
                        final int i7 = 0;
                        qe7.H(j5fVar3, 300L, new View.OnClickListener() { // from class: o5f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i8 = i7;
                                w5f w5fVar2 = w5fVar;
                                switch (i8) {
                                    case 0:
                                        w5fVar2.f.invoke();
                                        break;
                                    case 1:
                                        w5fVar2.d.invoke();
                                        break;
                                    default:
                                        w5fVar2.b.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams3 = j5fVar3.getLayoutParams();
                        if (layoutParams3 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        j5fVar3.setLayoutParams(marginLayoutParams3);
                        return j5fVar3;
                }
            }
        });
        this.f = new tyd(i);
        final int i4 = 2;
        this.g = rx8.P(3, new af7() { // from class: p5f
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                final w5f w5fVar = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        j5f j5fVar = new j5f(context2);
                        j5fVar.setId(R.id.messages_list_scroll_new_message);
                        j5fVar.setImageDrawable$message_list(j5fVar.getContext().getDrawable(R.drawable.icon_chevron_down_mini).mutate());
                        final int i6 = 2;
                        qe7.H(j5fVar, 300L, new View.OnClickListener() { // from class: o5f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i8 = i6;
                                w5f w5fVar2 = w5fVar;
                                switch (i8) {
                                    case 0:
                                        w5fVar2.f.invoke();
                                        break;
                                    case 1:
                                        w5fVar2.d.invoke();
                                        break;
                                    default:
                                        w5fVar2.b.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams = j5fVar.getLayoutParams();
                        if (layoutParams == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        j5fVar.setLayoutParams(marginLayoutParams);
                        return j5fVar;
                    case 1:
                        j5f j5fVar2 = new j5f(context2);
                        j5fVar2.setId(R.id.messages_list_scroll_mention);
                        j5fVar2.setImageDrawable$message_list(j5fVar2.getContext().getDrawable(R.drawable.icon_mention).mutate());
                        final int i7 = 1;
                        qe7.H(j5fVar2, 300L, new View.OnClickListener() { // from class: o5f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i8 = i7;
                                w5f w5fVar2 = w5fVar;
                                switch (i8) {
                                    case 0:
                                        w5fVar2.f.invoke();
                                        break;
                                    case 1:
                                        w5fVar2.d.invoke();
                                        break;
                                    default:
                                        w5fVar2.b.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams2 = j5fVar2.getLayoutParams();
                        if (layoutParams2 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        j5fVar2.setLayoutParams(marginLayoutParams2);
                        return j5fVar2;
                    default:
                        j5f j5fVar3 = new j5f(context2);
                        j5fVar3.setId(R.id.messages_list_scroll_reaction);
                        j5fVar3.setImageDrawable$message_list(j5fVar3.getContext().getDrawable(R.drawable.icon_heart).mutate());
                        final int i8 = 0;
                        qe7.H(j5fVar3, 300L, new View.OnClickListener() { // from class: o5f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i9 = i8;
                                w5f w5fVar2 = w5fVar;
                                switch (i9) {
                                    case 0:
                                        w5fVar2.f.invoke();
                                        break;
                                    case 1:
                                        w5fVar2.d.invoke();
                                        break;
                                    default:
                                        w5fVar2.b.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams3 = j5fVar3.getLayoutParams();
                        if (layoutParams3 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        j5fVar3.setLayoutParams(marginLayoutParams3);
                        return j5fVar3;
                }
            }
        });
        this.h = new EnumMap(r5f.class);
        this.i = new EnumMap(r5f.class);
        this.j = new EnumMap(r5f.class);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
    }

    public static void a(r5f r5fVar, EnumMap enumMap, EnumMap enumMap2, cf7 cf7Var) {
        ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(r5fVar);
        if (valueAnimator != null) {
            lsk.a(valueAnimator);
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(r5fVar);
        if (valueAnimator2 != null) {
            lsk.a(valueAnimator2);
        }
        enumMap2.put(r5fVar, (Object) null);
        enumMap.put(r5fVar, cf7Var.invoke(valueAnimator));
    }

    private final j5f getMentionButton() {
        return (j5f) this.e.getValue();
    }

    private final j5f getReactionButton() {
        return (j5f) this.g.getValue();
    }

    private final j5f getScrollToBottomButton() {
        return (j5f) this.c.getValue();
    }

    public final void b(r5f r5fVar) {
        j5f j5fVarD = d(r5fVar);
        if (this.i.get(r5fVar) != null) {
            return;
        }
        if (j5fVarD.getParent() == null && this.h.get(r5fVar) == null) {
            return;
        }
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "hide type:" + r5fVar, null);
            }
        }
        EnumMap enumMap = this.h;
        EnumMap enumMap2 = this.i;
        EnumMap enumMap3 = this.j;
        af7 af7Var = (af7) enumMap3.remove(r5fVar);
        if (af7Var != null) {
            af7Var.invoke();
        }
        ValueAnimator valueAnimator = (ValueAnimator) enumMap2.get(r5fVar);
        if (valueAnimator != null) {
            lsk.a(valueAnimator);
        }
        enumMap2.put(r5fVar, (Object) null);
        ValueAnimator valueAnimator2 = (ValueAnimator) enumMap.get(r5fVar);
        if (valueAnimator2 != null) {
            lsk.a(valueAnimator2);
        }
        enumMap.put(r5fVar, (Object) null);
        if (isInLayout()) {
            enumMap2.put(r5fVar, new ValueAnimator());
            enumMap3.put(r5fVar, n9j.b(this, new gb3(this, 5, r5fVar)));
        } else {
            j5f j5fVarD2 = d(r5fVar);
            a(r5fVar, enumMap2, enumMap, new v5f(j5fVarD2, this, r5fVar, this, j5fVarD2));
        }
    }

    public final void c(r5f r5fVar) {
        j5f j5fVarD = d(r5fVar);
        if (this.h.get(r5fVar) != null) {
            return;
        }
        if (j5fVarD.getParent() == null || this.i.get(r5fVar) != null) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "show type:" + r5fVar, null);
                }
            }
            EnumMap enumMap = this.i;
            EnumMap enumMap2 = this.h;
            EnumMap enumMap3 = this.j;
            af7 af7Var = (af7) enumMap3.remove(r5fVar);
            if (af7Var != null) {
                af7Var.invoke();
            }
            ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(r5fVar);
            if (valueAnimator != null) {
                lsk.a(valueAnimator);
            }
            enumMap.put(r5fVar, (Object) null);
            ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(r5fVar);
            if (valueAnimator2 != null) {
                lsk.a(valueAnimator2);
            }
            enumMap2.put(r5fVar, (Object) null);
            if (isInLayout()) {
                enumMap2.put(r5fVar, new ValueAnimator());
                enumMap3.put(r5fVar, n9j.b(this, new vw4(j5fVarD, this, r5fVar, 4)));
                return;
            }
            if (j5fVarD.getParent() != null) {
                removeView(j5fVarD);
            }
            if (r5fVar == r5f.a) {
                addView(j5fVarD, getChildCount());
            } else {
                addView(j5fVarD, 0);
            }
            a(r5fVar, this.h, this.i, new os1(j5fVarD, this, r5fVar, 19));
        }
    }

    public final j5f d(r5f r5fVar) {
        int i = s5f.$EnumSwitchMapping$0[r5fVar.ordinal()];
        if (i == 1) {
            return getScrollToBottomButton();
        }
        if (i == 2) {
            return getMentionButton();
        }
        if (i == 3) {
            return getReactionButton();
        }
        ore.o();
        return null;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        ny8 ny8Var = this.c;
        if (ny8Var.d()) {
            ((j5f) ny8Var.getValue()).onThemeChanged(kbcVar);
        }
        ny8 ny8Var2 = this.e;
        if (ny8Var2.d()) {
            ((j5f) ny8Var2.getValue()).onThemeChanged(kbcVar);
        }
        ny8 ny8Var3 = this.g;
        if (ny8Var3.d()) {
            ((j5f) ny8Var3.getValue()).onThemeChanged(kbcVar);
        }
    }

    public final void setOnClickListener(cf7 cf7Var) {
        this.b = new q5f(0, cf7Var);
        this.d = new q5f(1, cf7Var);
        this.f = new q5f(2, cf7Var);
    }
}
