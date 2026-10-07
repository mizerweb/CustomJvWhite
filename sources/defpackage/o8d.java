package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o8d extends ViewGroup {
    public static final /* synthetic */ zv8[] f = {new z8b(o8d.class, "bubbleColors", "getBubbleColors()Lone/me/sdk/design/theme/OneMeTheme$Bubbles$Colors;"), zo5.e(zfe.a, o8d.class, "state", "getState()Lone/me/messages/list/loader/model/PollAttachModel$ButtonState;")};
    public final n8d a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final n8d e;

    public o8d(final Context context) {
        super(context);
        final int i = 0;
        this.a = new n8d(this, 0);
        this.b = rx8.P(3, new af7() { // from class: m8d
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                o8d o8dVar = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        TextView textView = new TextView(context2);
                        q9i.a(q9i.t, textView);
                        textView.setGravity(17);
                        xac bubbleColors = o8dVar.getBubbleColors();
                        if (bubbleColors != null) {
                            textView.setTextColor(bubbleColors.b.e);
                        }
                        o8dVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
                        return textView;
                    case 1:
                        q9c q9cVar = new q9c(context2);
                        q9cVar.setAvatarSize(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                        q9cVar.setOverlayType(o9c.b);
                        o8dVar.addView(q9cVar, new ViewGroup.LayoutParams(-2, -2));
                        return q9cVar;
                    default:
                        uxb uxbVar = new uxb(context2);
                        uxbVar.setId(R.id.messages_list_poll_answers_button);
                        xac bubbleColors2 = o8dVar.getBubbleColors();
                        if (bubbleColors2 != null) {
                            uxbVar.a(bubbleColors2);
                        }
                        o8dVar.addView(uxbVar, new ViewGroup.LayoutParams(-2, -2));
                        return uxbVar;
                }
            }
        });
        final int i2 = 1;
        this.c = rx8.P(3, new af7() { // from class: m8d
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                o8d o8dVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        TextView textView = new TextView(context2);
                        q9i.a(q9i.t, textView);
                        textView.setGravity(17);
                        xac bubbleColors = o8dVar.getBubbleColors();
                        if (bubbleColors != null) {
                            textView.setTextColor(bubbleColors.b.e);
                        }
                        o8dVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
                        return textView;
                    case 1:
                        q9c q9cVar = new q9c(context2);
                        q9cVar.setAvatarSize(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                        q9cVar.setOverlayType(o9c.b);
                        o8dVar.addView(q9cVar, new ViewGroup.LayoutParams(-2, -2));
                        return q9cVar;
                    default:
                        uxb uxbVar = new uxb(context2);
                        uxbVar.setId(R.id.messages_list_poll_answers_button);
                        xac bubbleColors2 = o8dVar.getBubbleColors();
                        if (bubbleColors2 != null) {
                            uxbVar.a(bubbleColors2);
                        }
                        o8dVar.addView(uxbVar, new ViewGroup.LayoutParams(-2, -2));
                        return uxbVar;
                }
            }
        });
        final int i3 = 2;
        this.d = rx8.P(3, new af7() { // from class: m8d
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                o8d o8dVar = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        TextView textView = new TextView(context2);
                        q9i.a(q9i.t, textView);
                        textView.setGravity(17);
                        xac bubbleColors = o8dVar.getBubbleColors();
                        if (bubbleColors != null) {
                            textView.setTextColor(bubbleColors.b.e);
                        }
                        o8dVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
                        return textView;
                    case 1:
                        q9c q9cVar = new q9c(context2);
                        q9cVar.setAvatarSize(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                        q9cVar.setOverlayType(o9c.b);
                        o8dVar.addView(q9cVar, new ViewGroup.LayoutParams(-2, -2));
                        return q9cVar;
                    default:
                        uxb uxbVar = new uxb(context2);
                        uxbVar.setId(R.id.messages_list_poll_answers_button);
                        xac bubbleColors2 = o8dVar.getBubbleColors();
                        if (bubbleColors2 != null) {
                            uxbVar.a(bubbleColors2);
                        }
                        o8dVar.addView(uxbVar, new ViewGroup.LayoutParams(-2, -2));
                        return uxbVar;
                }
            }
        });
        this.e = new n8d(this, 1);
    }

    public static final void a(o8d o8dVar, a7d a7dVar) {
        ny8 ny8Var = o8dVar.b;
        ny8 ny8Var2 = o8dVar.c;
        ny8 ny8Var3 = o8dVar.d;
        if (a7dVar instanceof x6d) {
            x6d x6dVar = (x6d) a7dVar;
            List<ylc> list = x6dVar.a;
            if (n7j.o(ny8Var3)) {
                ((uxb) ny8Var3.getValue()).setVisibility(8);
            }
            o8dVar.getAvatarStack().setVisibility(list.isEmpty() ? 8 : 0);
            o8dVar.getTextView().setVisibility(0);
            o8dVar.getAvatarStack().setAvatars(list);
            o8dVar.getTextView().setText(x6dVar.b.d(o8dVar));
            return;
        }
        if (a7dVar instanceof y6d) {
            y6d y6dVar = (y6d) a7dVar;
            if (n7j.o(ny8Var2)) {
                ((q9c) ny8Var2.getValue()).setVisibility(8);
            }
            if (n7j.o(ny8Var)) {
                ((TextView) ny8Var.getValue()).setVisibility(8);
            }
            o8dVar.getBubbleButton().setVisibility(0);
            uxb bubbleButton = o8dVar.getBubbleButton();
            bubbleButton.setText(y6dVar.a.d(bubbleButton));
            bubbleButton.setAvatars(y6dVar.b);
            return;
        }
        if (a7dVar instanceof z6d) {
            z6d z6dVar = (z6d) a7dVar;
            if (n7j.o(ny8Var2)) {
                ((q9c) ny8Var2.getValue()).setVisibility(8);
            }
            if (n7j.o(ny8Var3)) {
                ((uxb) ny8Var3.getValue()).setVisibility(8);
            }
            o8dVar.getTextView().setVisibility(0);
            o8dVar.getTextView().setText(z6dVar.a.d(o8dVar));
            return;
        }
        if (a7dVar != null) {
            ore.o();
            return;
        }
        if (n7j.o(ny8Var3)) {
            ((uxb) ny8Var3.getValue()).setVisibility(8);
        }
        if (n7j.o(ny8Var2)) {
            ((q9c) ny8Var2.getValue()).setVisibility(8);
        }
        if (n7j.o(ny8Var)) {
            ((TextView) ny8Var.getValue()).setVisibility(8);
        }
    }

    private final q9c getAvatarStack() {
        return (q9c) this.c.getValue();
    }

    private final uxb getBubbleButton() {
        return (uxb) this.d.getValue();
    }

    private final TextView getTextView() {
        return (TextView) this.b.getValue();
    }

    public final xac getBubbleColors() {
        zv8 zv8Var = f[0];
        return (xac) this.a.b;
    }

    public final a7d getState() {
        zv8 zv8Var = f[1];
        return (a7d) this.e.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB;
        a7d state = getState();
        if (!(state instanceof x6d)) {
            if (state instanceof y6d) {
                qyj.M(getBubbleButton(), 0, 0, 0, 12);
                return;
            }
            if (state instanceof z6d) {
                TextView textView = (TextView) this.b.getValue();
                qyj.M(textView, (getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2), (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), 0, 12);
                return;
            } else {
                if (state == null) {
                    return;
                }
                ore.o();
                return;
            }
        }
        ny8 ny8Var = this.c;
        if (n7j.o(ny8Var)) {
            iB = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, getAvatarStack().getMeasuredWidth());
        } else {
            iB = 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - ((getTextView().getMeasuredWidth() + iB) / 2);
        int measuredHeight = getMeasuredHeight() / 2;
        int measuredHeight2 = measuredHeight - (getTextView().getMeasuredHeight() / 2);
        if (n7j.o(ny8Var)) {
            qyj.M((q9c) ny8Var.getValue(), measuredWidth, measuredHeight - (getAvatarStack().getMeasuredHeight() / 2), 0, 12);
        }
        qyj.M(getTextView(), measuredWidth + iB, measuredHeight2, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        a7d state = getState();
        if (state instanceof x6d) {
            getAvatarStack().measure(i, i2);
            getTextView().measure(i, i2);
        } else if (state instanceof y6d) {
            getBubbleButton().measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        } else if (state instanceof z6d) {
            getTextView().measure(i, i2);
        } else if (state != null) {
            ore.o();
            return;
        }
        setMeasuredDimension(i, i2);
    }

    public final void setBubbleColors(xac xacVar) {
        this.a.B(this, f[0], xacVar);
    }

    public final void setOnButtonClickListener(af7 af7Var) {
        qe7.H(this, 300L, new d8(14, af7Var));
    }

    public final void setState(a7d a7dVar) {
        this.e.B(this, f[1], a7dVar);
    }
}
