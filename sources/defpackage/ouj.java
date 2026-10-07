package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;
import one.me.sdk.media.ffmpeg.WebmFactory;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ouj extends FrameLayout {
    public final zo7 a;
    public final nuj b;
    public boolean c;
    public boolean d;
    public rmg e;

    public ouj(Context context) {
        super(context, null);
        zo7 zo7Var = new zo7(context, 15);
        this.a = zo7Var;
        nuj nujVar = new nuj(context);
        nujVar.setId(R.id.oneme_stickers_sticker_webm);
        nujVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = nujVar;
        addView((l1c) zo7Var.b);
        addView(nujVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
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
    public final void a(tlg tlgVar, int i) {
        boolean z;
        rmg rmgVar = this.e;
        if (rmgVar != null) {
            rmgVar.b(tlgVar);
        }
        String str = tlgVar.f;
        int i2 = 1;
        zo7 zo7Var = this.a;
        nuj nujVar = this.b;
        if (str == null || str.length() == 0) {
            nujVar.f();
            nujVar.setVisibility(8);
            ((l1c) zo7Var.b).setVisibility(0);
        } else {
            nujVar.setOnFirstFrameListener(new atj(i2, this));
            nujVar.setVisibility(0);
            this.c = true;
            if (str.length() == 0) {
                nujVar.f();
            } else {
                String str2 = nujVar.a;
                if (str2 == null || !str2.equals(str)) {
                    nujVar.b = true;
                    nujVar.a = str;
                    AnimatedFileDrawable animatedFileDrawableCreate = WebmFactory.create(new WebmFactory.Config.Builder().setAutoStart(true).setAutoRepeat(true).setWay(new WebmFactory.Way.Url.Builder().setUrl(str).setSize(i, i).setNetworkFetchEnabled(true).build()).build());
                    animatedFileDrawableCreate.addOnNextFrameRenderedListener(nujVar);
                    nujVar.setImageDrawable(animatedFileDrawableCreate);
                } else {
                    z = false;
                }
                this.c = false;
                i2 = (z || this.d) ? 0 : 1;
                this.d = false;
            }
            z = true;
            this.c = false;
            if (z) {
            }
            this.d = false;
        }
        if (i2 != 0) {
            zo7Var.g(tlgVar.d);
        }
    }

    public final void b(dj9 dj9Var) {
        if (dj9Var.a == null) {
            dj9Var.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = dj9Var.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final rmg getSizeConfigurator() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        rmg rmgVar = this.e;
        gx gxVarA = rmgVar != null ? rmgVar.a(i, i2) : null;
        if (gxVarA != null) {
            i = gxVarA.a;
        }
        if (gxVarA != null) {
            i2 = gxVarA.b;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(rmg rmgVar) {
        this.e = rmgVar;
    }
}
