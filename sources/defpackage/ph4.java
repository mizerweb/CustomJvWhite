package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ph4 extends wf4 implements eph {
    public final ViewStub A;
    public xva B;
    public boolean C;
    public long D;
    public final kwb s;
    public final TextView t;
    public final TextView u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final ViewStub y;
    public final ViewStub z;

    public ph4(final Context context) {
        super(context, null);
        final int i = 0;
        this.v = rx8.P(3, new af7() { // from class: nh4
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ph4 ph4Var = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        return ph4.w(context2, ph4Var);
                    case 1:
                        return ph4.v(context2, ph4Var);
                    default:
                        return ph4.u(context2, ph4Var);
                }
            }
        });
        final int i2 = 1;
        this.w = rx8.P(3, new af7() { // from class: nh4
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                ph4 ph4Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        return ph4.w(context2, ph4Var);
                    case 1:
                        return ph4.v(context2, ph4Var);
                    default:
                        return ph4.u(context2, ph4Var);
                }
            }
        });
        final int i3 = 2;
        this.x = rx8.P(3, new af7() { // from class: nh4
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                ph4 ph4Var = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        return ph4.w(context2, ph4Var);
                    case 1:
                        return ph4.v(context2, ph4Var);
                    default:
                        return ph4.u(context2, ph4Var);
                }
            }
        });
        this.D = BuildConfig.MAX_TIME_TO_UPLOAD;
        setLayoutParams(new uf4(-1, -2));
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        setBackground(getBackgroundDrawable());
        setOnLongClickListener(new cw0(3, this));
        qe7.H(this, 300L, new oh4(this, 0));
        kwb kwbVar = new kwb(context);
        kwbVar.setId(R.id.oneme_contact_call_cell_avatar);
        kwbVar.setAvatarShape(awb.a);
        this.s = kwbVar;
        TextView textViewE = qv1.e(context, R.id.oneme_contact_call_cell_title);
        q9i.a(q9i.f, textViewE);
        textViewE.setTextColor(getTitleText());
        textViewE.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewE.setEllipsize(truncateAt);
        np4.C(textViewE, false);
        this.t = textViewE;
        TextView textViewE2 = qv1.e(context, R.id.oneme_contact_call_cell_description);
        q9i.a(q9i.g, textViewE2);
        textViewE2.setTextColor(getDescriptionColor());
        textViewE2.setMaxLines(1);
        textViewE2.setEllipsize(truncateAt);
        Object tag = textViewE2.getTag(R.id.oneme_theme_textview_for_span_attach_listener);
        if ((tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null) != null) {
            gm0.Y("ViewThemeUtils", "try to observe onThemeChanged for spans in TextView more than once for " + n1g.A(textViewE2));
        } else {
            vn2 vn2Var = new vn2();
            textViewE2.setTag(R.id.oneme_theme_textview_for_span_attach_listener, vn2Var);
            if (textViewE2.isAttachedToWindow()) {
                vn2Var.onViewAttachedToWindow(textViewE2);
            }
            textViewE2.addOnAttachStateChangeListener(vn2Var);
        }
        this.u = textViewE2;
        ViewStub viewStubI = bc1.i(context, R.id.oneme_contact_call_cell_stub_time_text);
        this.y = viewStubI;
        ViewStub viewStubI2 = bc1.i(context, R.id.oneme_contact_call_cell_stub_audio_call_button);
        this.z = viewStubI2;
        ViewStub viewStubI3 = bc1.i(context, R.id.oneme_contact_call_cell_stub_video_call_button);
        this.A = viewStubI3;
        addView(kwbVar, gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        addView(textViewE, 0, -2);
        addView(textViewE2, 0, -2);
        addView(viewStubI);
        addView(viewStubI2);
        addView(viewStubI3);
        eg4 eg4VarH = ch3.h(this);
        int id = kwbVar.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 4, 0, 4);
        int id2 = textViewE.getId();
        eg4VarH.d(id2, 3, kwbVar.getId(), 3);
        eg4VarH.d(id2, 6, kwbVar.getId(), 7);
        new bsb(6, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.d(id2, 7, viewStubI.getId(), 6);
        new bsb(7, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        eg4VarH.d(id2, 4, textViewE2.getId(), 3);
        eg4VarH.g(id2).d.W = 2;
        eg4VarH.g(id2).d.l0 = true;
        int id3 = textViewE2.getId();
        eg4VarH.d(id3, 3, textViewE.getId(), 4);
        new bsb(3, eg4VarH, id3).a(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id3, 6, textViewE.getId(), 6);
        eg4VarH.d(id3, 7, textViewE.getId(), 7);
        eg4VarH.d(id3, 4, kwbVar.getId(), 4);
        eg4VarH.g(id3).d.l0 = true;
        int id4 = viewStubI.getId();
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 7, viewStubI2.getId(), 6);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id4));
        eg4VarH.d(id4, 4, 0, 4);
        int id5 = viewStubI2.getId();
        eg4VarH.d(id5, 3, 0, 3);
        eg4VarH.d(id5, 7, viewStubI3.getId(), 6);
        eg4VarH.d(id5, 4, 0, 4);
        int id6 = viewStubI3.getId();
        eg4VarH.d(id6, 3, 0, 3);
        eg4VarH.d(id6, 7, 0, 7);
        eg4VarH.d(id6, 4, 0, 4);
        eg4VarH.a(this);
    }

    private final ImageView getAudioCallButton() {
        return (ImageView) this.w.getValue();
    }

    private final RippleDrawable getBackgroundDrawable() {
        return col.b(((bs0) pq3.j.h(this).u().c.g).c, null, new ColorDrawable(-1));
    }

    private final int getDescriptionColor() {
        return pq3.j.h(this).getText().d;
    }

    private final RippleDrawable getRippleDrawableButton() {
        int i = ((bs0) pq3.j.h(this).u().c.g).c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-1);
        return col.b(i, null, shapeDrawable);
    }

    private final TextView getTimeTextView() {
        return (TextView) this.v.getValue();
    }

    private final int getTitleText() {
        boolean z = this.C;
        dbc text = pq3.j.h(this).getText();
        return z ? text.j : text.b;
    }

    private final ImageView getVideoCallButton() {
        return (ImageView) this.x.getValue();
    }

    public static ImageView u(Context context, ph4 ph4Var) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        imageView.setImageResource(R.drawable.icon_video_call);
        x05.j(8.0f, yl5.d().getDisplayMetrics().density, imageView);
        imageView.setBackground(ph4Var.getRippleDrawableButton());
        imageView.setContentDescription(context.getString(R.string.call_history_item_call_video_button_accessibility));
        imageView.setVisibility(8);
        imageView.setImageTintList(ColorStateList.valueOf(pq3.j.h(imageView).getIcon().b));
        qe7.H(imageView, 300L, new oh4(ph4Var, 2));
        return imageView;
    }

    public static ImageView v(Context context, ph4 ph4Var) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        imageView.setImageResource(R.drawable.icon_call);
        imageView.setBackground(ph4Var.getRippleDrawableButton());
        imageView.setContentDescription(context.getString(R.string.call_history_item_call_audio_button_accessibility));
        imageView.setVisibility(8);
        imageView.setImageTintList(ColorStateList.valueOf(pq3.j.h(imageView).getIcon().b));
        qe7.H(imageView, 300L, new oh4(ph4Var, 1));
        return imageView;
    }

    public static TextView w(Context context, ph4 ph4Var) {
        TextView textView = new TextView(context);
        textView.setLayoutParams(new uf4(-2, -2));
        q9i.a(q9i.i, textView);
        textView.setTextColor(ph4Var.getDescriptionColor());
        return textView;
    }

    public final void B(long j, CharSequence charSequence, String str) {
        String string = str != null ? str.toString() : null;
        Long lValueOf = Long.valueOf(j);
        if (charSequence == null) {
            charSequence = "";
        }
        kwb.v(this.s, string, lValueOf, charSequence);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.t.setTextColor(getTitleText());
        getTimeTextView().setTextColor(getDescriptionColor());
        this.u.setTextColor(getDescriptionColor());
        getAudioCallButton().setBackground(getRippleDrawableButton());
        getVideoCallButton().setBackground(getRippleDrawableButton());
        setBackground(getBackgroundDrawable());
        getAudioCallButton().setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
        getVideoCallButton().setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
    }

    public final void setAvatarOverlay(zvb zvbVar) {
        this.s.setOverlay(zvbVar);
    }

    public final void setAvatarPlaceholder(Drawable drawable) {
        kwb.y(this.s, drawable, null, null, null, 30);
    }

    public final void setDescription(CharSequence charSequence) {
        this.u.setText(charSequence);
    }

    public final void setTime(CharSequence charSequence) {
        ViewStub viewStub = this.y;
        if (n7j.n(viewStub) || !r5h.X0(charSequence)) {
            n7j.m(viewStub, getTimeTextView(), null);
            getTimeTextView().setText(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.t.setText(charSequence);
    }

    public final void x(boolean z) {
        ViewStub viewStub = this.z;
        if (n7j.n(viewStub) || z) {
            n7j.m(viewStub, getAudioCallButton(), null);
            getAudioCallButton().setVisibility(z ? 0 : 8);
        }
    }

    public final void y(boolean z) {
        ViewStub viewStub = this.A;
        if (n7j.n(viewStub) || z) {
            n7j.m(viewStub, getVideoCallButton(), null);
            getVideoCallButton().setVisibility(z ? 0 : 8);
        }
    }

    public final void z(boolean z) {
        this.C = z;
        this.t.setTextColor(getTitleText());
    }
}
