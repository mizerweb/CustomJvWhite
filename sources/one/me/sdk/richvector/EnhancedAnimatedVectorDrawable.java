package one.me.sdk.richvector;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import defpackage.gi;
import defpackage.hsi;
import defpackage.q96;
import defpackage.r96;
import defpackage.s96;
import defpackage.tj;
import defpackage.tre;
import defpackage.uj;
import defpackage.ww3;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0002Zm\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0001iB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0006H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020+2\u0006\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020+H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020%H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\u0010J\u000f\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\u0010J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0010J\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010\u0010J\u000f\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010#J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010#J\r\u0010=\u001a\u00020\f¢\u0006\u0004\b=\u0010#J\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010#J\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010#J\r\u0010@\u001a\u00020\f¢\u0006\u0004\b@\u0010#J\u0015\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020+H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020+2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010#J\u0019\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\fH\u0016¢\u0006\u0004\bS\u0010#J\u0019\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010T\u001a\u00020NH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\fH\u0016¢\u0006\u0004\bX\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010YR\u0014\u0010H\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010a\u001a\u0012\u0012\u0004\u0012\u00020P0_j\b\u0012\u0004\u0012\u00020P``8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR \u0010d\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020N0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010l\u001a\u0012\u0012\u0004\u0012\u00020G0_j\b\u0012\u0004\u0012\u00020G``8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010bR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006p"}, d2 = {"Lone/me/sdk/richvector/EnhancedAnimatedVectorDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "", "Landroid/content/Context;", "context", "", "resId", "<init>", "(Landroid/content/Context;I)V", "Landroid/graphics/Canvas;", "canvas", "Lsbi;", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getColorFilter", "()Landroid/graphics/ColorFilter;", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "jumpToCurrentState", "()V", "getOpacity", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "", "state", "", "onStateChange", "([I)Z", "level", "onLevelChange", "(I)Z", "visible", "restart", "setVisible", "(ZZ)Z", "getDirtyBounds", "()Landroid/graphics/Rect;", "getIntrinsicWidth", "getIntrinsicHeight", "getMinimumWidth", "getMinimumHeight", "start", "stop", "startReverse", "reset", "onStart", "onEnd", "", "duration", "setDuration", "(J)V", "isRunning", "()Z", "Lgi;", "callback", "registerAnimationCallback", "(Lgi;)V", "unregisterAnimationCallback", "(Lgi;)Z", "clearAnimationCallbacks", "", "targetName", "Landroid/animation/Animator;", "findAnimations", "(Ljava/lang/String;)Landroid/animation/Animator;", "invalidateAnimations", SdkMetricStatEvent.NAME_KEY, "Lone/me/sdk/richvector/VectorPath;", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/VectorPath;", "invalidatePath", "I", "s96", "Ls96;", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "drawable", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "animators", "Ljava/util/ArrayList;", "Landroid/util/ArrayMap;", "targetNameMap", "Landroid/util/ArrayMap;", "Landroid/animation/AnimatorSet;", "animatorSetFromXml", "Landroid/animation/AnimatorSet;", "Lq96;", "animator", "Lq96;", "animationCallbacks", "r96", "animatorListener", "Lr96;", "rich-vector"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EnhancedAnimatedVectorDrawable extends Drawable implements Animatable, hsi {
    private final ArrayList<gi> animationCallbacks;
    private q96 animator;
    private final r96 animatorListener;
    private AnimatorSet animatorSetFromXml;
    private final ArrayList<Animator> animators;
    private final s96 callback;
    private final EnhancedVectorDrawable drawable;
    private final int resId;
    private final ArrayMap<Animator, String> targetNameMap;

    public EnhancedAnimatedVectorDrawable(Context context, int i) throws XmlPullParserException, IOException {
        this.resId = i;
        s96 s96Var = new s96(this);
        this.callback = s96Var;
        this.animationCallbacks = new ArrayList<>();
        this.animatorListener = new r96(this);
        tj tjVarB = new uj(context).b(i);
        EnhancedVectorDrawable enhancedVectorDrawable = tjVarB.a;
        enhancedVectorDrawable.setCallback(s96Var);
        this.drawable = enhancedVectorDrawable;
        ArrayList<Animator> arrayList = tjVarB.b;
        this.animators = arrayList;
        ArrayMap<Animator, String> arrayMap = tjVarB.c;
        this.targetNameMap = arrayMap;
        AnimatorSet animatorSet = new AnimatorSet();
        tre.v0(enhancedVectorDrawable, animatorSet, arrayList, arrayMap);
        this.animatorSetFromXml = animatorSet;
        this.animator = new q96(this, animatorSet);
    }

    public void clearAnimationCallbacks() {
        q96 q96Var = this.animator;
        q96Var.b.removeListener(this.animatorListener);
        this.animationCallbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        q96 q96Var = this.animator;
        if (q96Var.b.isStarted()) {
            q96Var.a.invalidateSelf();
        }
        this.drawable.draw(canvas);
    }

    public Animator findAnimations(String targetName) {
        Integer numValueOf = Integer.valueOf(ww3.v1(this.targetNameMap.values(), targetName));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return this.targetNameMap.keyAt(numValueOf.intValue());
    }

    @Override // defpackage.hsi
    public VectorPath findPath(String name) {
        return this.drawable.findPath(name);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.drawable.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.drawable.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.drawable.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void invalidateAnimations() {
        AnimatorSet animatorSet = new AnimatorSet();
        tre.v0(this.drawable, animatorSet, this.animators, this.targetNameMap);
        this.animatorSetFromXml = animatorSet;
        q96 q96Var = this.animator;
        q96Var.b.removeListener(this.animatorListener);
        q96 q96Var2 = new q96(this, this.animatorSetFromXml);
        if (this.animationCallbacks.size() != 0) {
            q96Var2.b.addListener(this.animatorListener);
        }
        this.animator = q96Var2;
    }

    @Override // defpackage.hsi
    public void invalidatePath() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.animator.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.animator.b.end();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.drawable.setBounds(bounds);
    }

    public final void onEnd() {
        this.animator.b.end();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        return this.drawable.setLevel(level);
    }

    public final void onStart() {
        q96 q96Var = this.animator;
        AnimatorSet animatorSet = q96Var.b;
        animatorSet.start();
        animatorSet.pause();
        animatorSet.setCurrentPlayTime(0L);
        q96Var.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
        return this.drawable.setState(state);
    }

    public void registerAnimationCallback(gi callback) {
        if (this.animationCallbacks.size() == 0) {
            q96 q96Var = this.animator;
            q96Var.b.addListener(this.animatorListener);
        }
        if (this.animationCallbacks.contains(callback)) {
            return;
        }
        this.animationCallbacks.add(callback);
    }

    public final void reset() {
        q96 q96Var = this.animator;
        AnimatorSet animatorSet = q96Var.b;
        if (!animatorSet.isStarted()) {
            animatorSet.start();
            q96Var.a.invalidateSelf();
        }
        q96Var.b.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.drawable.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
    }

    public final void setDuration(long duration) {
        this.animator.b.setDuration(duration);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        this.drawable.setTintList(tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.drawable.setTintMode(tintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        q96 q96Var = this.animator;
        if (q96Var.c && q96Var.b.isStarted()) {
            q96 q96Var2 = this.animator;
            if (visible) {
                q96Var2.b.resume();
            } else {
                q96Var2.b.pause();
            }
        }
        this.drawable.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        q96 q96Var = this.animator;
        AnimatorSet animatorSet = q96Var.b;
        if (animatorSet.isStarted()) {
            return;
        }
        animatorSet.start();
        q96Var.a.invalidateSelf();
    }

    public final void startReverse() {
        q96 q96Var = this.animator;
        q96Var.b.reverse();
        q96Var.a.invalidateSelf();
        q96 q96Var2 = this.animator;
        AnimatorSet animatorSet = q96Var2.b;
        if (animatorSet.isStarted()) {
            return;
        }
        animatorSet.start();
        q96Var2.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.animator.b.end();
    }

    public boolean unregisterAnimationCallback(gi callback) {
        boolean zRemove = this.animationCallbacks.remove(callback);
        if (this.animationCallbacks.size() == 0) {
            q96 q96Var = this.animator;
            q96Var.b.removeListener(this.animatorListener);
        }
        return zRemove;
    }
}
