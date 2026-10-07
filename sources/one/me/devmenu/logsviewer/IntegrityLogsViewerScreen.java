package one.me.devmenu.logsviewer;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a8g;
import defpackage.af7;
import defpackage.af8;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.ite;
import defpackage.k96;
import defpackage.lq4;
import defpackage.mj8;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o37;
import defpackage.oi8;
import defpackage.oj8;
import defpackage.pq3;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sy7;
import defpackage.v22;
import defpackage.wbc;
import defpackage.we9;
import defpackage.xhh;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.devmenu.logsviewer.IntegrityLogsViewerScreen;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000b"}, d2 = {"Lone/me/devmenu/logsviewer/IntegrityLogsViewerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "oj8", "pj8", "logsviewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IntegrityLogsViewerScreen extends Widget {
    public static final int f = View.generateViewId();
    public final oi8 a;
    public final h b;
    public final oj8 c;
    public final ny8 d;
    public final ny8 e;

    public IntegrityLogsViewerScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new h(m35getAccountScopeuqN4xOY());
        this.c = new oj8();
        final int i = 0;
        this.d = rx8.P(3, new af7(this) { // from class: nj8
            public final /* synthetic */ IntegrityLogsViewerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                IntegrityLogsViewerScreen integrityLogsViewerScreen = this.b;
                switch (i2) {
                    case 0:
                        int i3 = IntegrityLogsViewerScreen.f;
                        return new k96(integrityLogsViewerScreen.getContext());
                    default:
                        int i4 = IntegrityLogsViewerScreen.f;
                        return new ImageView(integrityLogsViewerScreen.getContext());
                }
            }
        });
        final int i2 = 1;
        this.e = rx8.P(3, new af7(this) { // from class: nj8
            public final /* synthetic */ IntegrityLogsViewerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                IntegrityLogsViewerScreen integrityLogsViewerScreen = this.b;
                switch (i3) {
                    case 0:
                        int i4 = IntegrityLogsViewerScreen.f;
                        return new k96(integrityLogsViewerScreen.getContext());
                    default:
                        int i5 = IntegrityLogsViewerScreen.f;
                        return new ImageView(integrityLogsViewerScreen.getContext());
                }
            }
        });
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
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
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rcc rccVar = new rcc(getContext());
        rccVar.setId(f);
        rccVar.setTitle("Логи целостности");
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new mj8(this, 1)));
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(rccVar, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(linearLayout.getContext());
        a8g a8gVar = pq3.j;
        view.setBackgroundColor(a8gVar.h(view).B().b);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, gm0.J(((double) yl5.d().getDisplayMetrics().density) * 0.5d)));
        ny8 ny8Var = this.d;
        k96 k96Var = (k96) ny8Var.getValue();
        k96Var.setId(R.id.oneme_devmenu_logsviewer_show_log_recycler_view);
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager(1, false));
        k96Var.setAdapter(this.c);
        k96Var.h(new sy7(new ColorDrawable(-7829368)), -1);
        k96 k96Var2 = (k96) ny8Var.getValue();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(k96Var2, layoutParams);
        ny8 ny8Var2 = this.e;
        ImageView imageView = (ImageView) ny8Var2.getValue();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.gravity = 85;
        layoutParams2.setMargins(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams2);
        imageView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(2, a8gVar.h(imageView).B().c);
        gradientDrawable.setColor(a8gVar.h(imageView).k().h);
        imageView.setBackground(gradientDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.icon_chevron_down_mini).mutate());
        frameLayout.addView(linearLayout, -1, -1);
        frameLayout.addView((ImageView) ny8Var2.getValue());
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        h hVar = this.b;
        we9 we9Var = new we9((ite) hVar.getAccessor().c(90), ((n0c) ((xhh) hVar.getAccessor().c(23))).b(), new mj8(this, 0));
        int i = 3;
        yab.i0((ite) hVar.getAccessor().c(90), null, 0, new af8(we9Var, this, (lq4) null, 1), 3);
        ((ImageView) this.e.getValue()).setOnClickListener(new o37(9, this));
        k96 k96Var = (k96) this.d.getValue();
        if (k96Var != null) {
            k96Var.k(new v22(i, this));
        }
    }

    public IntegrityLogsViewerScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
