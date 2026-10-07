package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.InflateException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cl {
    public static final pgg c = new pgg(22);
    public final Context a;
    public final Resources b;

    public cl(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Animator a(XmlResourceParser xmlResourceParser, AnimatorSet animatorSet, int i) {
        ObjectAnimator objectAnimator;
        Animator animator;
        Integer numB0;
        cl clVar = this;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int eventType = xmlResourceParser2.getEventType();
        int depth = xmlResourceParser2.getDepth();
        xmlResourceParser2.next();
        ArrayList arrayList = null;
        Animator animator2 = null;
        while (true) {
            int iIntValue = 0;
            if (eventType != 3 || xmlResourceParser2.getDepth() > depth) {
                char c2 = 1;
                if (eventType != 1) {
                    if (eventType != 2) {
                        eventType = xmlResourceParser2.next();
                    } else {
                        String name = xmlResourceParser2.getName();
                        animator2 = animator2;
                        if (name != null) {
                            animator2 = animator2;
                            switch (name.hashCode()) {
                                case -1678405661:
                                    animator2 = animator2;
                                    if (name.equals("propertyValuesHolder")) {
                                        throw new jib("An operation is not implemented: Not implemented yet");
                                    }
                                    break;
                                case -1493597370:
                                    animator2 = animator2;
                                    if (name.equals("objectAnimator")) {
                                        k81 k81Var = new k81(xmlResourceParser2);
                                        objectAnimator = new ObjectAnimator();
                                        clVar.b(objectAnimator, k81Var);
                                        sk skVar = sk.e;
                                        Context context = clVar.a;
                                        String str = (String) skVar.e(context, k81Var);
                                        if (str.length() <= 0) {
                                            objectAnimator.setPropertyName((String) sk.f.e(context, k81Var));
                                        } else {
                                            String str2 = (String) uk.d.e(context, k81Var);
                                            String str3 = (String) uk.e.e(context, k81Var);
                                            il ilVar = (il) sk.j.e(context, k81Var);
                                            if (!(ilVar instanceof gl)) {
                                                boolean z = ilVar instanceof hl;
                                            }
                                            if (str2.length() == 0 && str2.length() == 0) {
                                                throw new InflateException("propertyXName or propertyYName is need for PathData");
                                            }
                                            Path pathR = qyj.r(str);
                                            PathMeasure pathMeasure = new PathMeasure(pathR, false);
                                            ArrayList arrayList2 = new ArrayList();
                                            float f = 0.0f;
                                            arrayList2.add(Float.valueOf(0.0f));
                                            float length = 0.0f;
                                            while (true) {
                                                length = pathMeasure.getLength() + length;
                                                char c3 = c2;
                                                arrayList2.add(Float.valueOf(length));
                                                if (!pathMeasure.nextContour()) {
                                                    PathMeasure pathMeasure2 = new PathMeasure(pathR, false);
                                                    int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                                                    float[] fArr = new float[iMin];
                                                    float[] fArr2 = new float[iMin];
                                                    float[] fArr3 = new float[2];
                                                    float f2 = length / (iMin - 1);
                                                    int i2 = 0;
                                                    for (int i3 = 0; i3 < iMin; i3++) {
                                                        int i4 = i2;
                                                        pathMeasure2.getPosTan(f - ((Number) arrayList2.get(i2)).floatValue(), fArr3, null);
                                                        fArr[i3] = fArr3[0];
                                                        fArr2[i3] = fArr3[c3];
                                                        f += f2;
                                                        i2 = i4 + 1;
                                                        if (i2 >= arrayList2.size() || f <= ((Number) arrayList2.get(i2)).floatValue()) {
                                                            i2 = i4;
                                                        } else {
                                                            pathMeasure2.nextContour();
                                                        }
                                                    }
                                                    if (str2.length() <= 0) {
                                                        str2 = null;
                                                    }
                                                    PropertyValuesHolder propertyValuesHolderOfFloat = str2 != null ? PropertyValuesHolder.ofFloat(str2, Arrays.copyOf(fArr, iMin)) : null;
                                                    if (str3.length() <= 0) {
                                                        str3 = null;
                                                    }
                                                    PropertyValuesHolder propertyValuesHolderOfFloat2 = str3 != null ? PropertyValuesHolder.ofFloat(str3, Arrays.copyOf(fArr2, iMin)) : null;
                                                    if (propertyValuesHolderOfFloat == null) {
                                                        objectAnimator.setValues(propertyValuesHolderOfFloat2);
                                                    } else if (propertyValuesHolderOfFloat2 == null) {
                                                        objectAnimator.setValues(propertyValuesHolderOfFloat);
                                                    } else {
                                                        objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case -795202841:
                                    animator2 = animator2;
                                    if (name.equals("animator")) {
                                        ValueAnimator valueAnimator = new ValueAnimator();
                                        clVar.b(valueAnimator, xmlResourceParser2);
                                        animator = valueAnimator;
                                        animator2 = animator;
                                    }
                                    break;
                                case 113762:
                                    animator2 = animator2;
                                    if (name.equals("set")) {
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        Integer num = (Integer) n1g.h(xmlResourceParser2).get("ordering");
                                        if (num != null && (numB0 = y5h.B0(xmlResourceParser2.getAttributeValue(num.intValue()))) != null) {
                                            iIntValue = numB0.intValue();
                                        }
                                        clVar.a(xmlResourceParser2, animatorSet2, iIntValue);
                                        animator = animatorSet2;
                                        animator2 = animator;
                                    }
                                    break;
                            }
                        }
                        if (animatorSet != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (animator2 != null) {
                                arrayList.add(animator2);
                            }
                        }
                        animator2 = objectAnimator;
                        animator2 = objectAnimator;
                        animator2 = objectAnimator;
                        animator2 = objectAnimator;
                        eventType = xmlResourceParser.next();
                        clVar = this;
                        xmlResourceParser2 = xmlResourceParser;
                    }
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            if (i == 0) {
                Animator[] animatorArr = (Animator[]) arrayList.toArray(new Animator[0]);
                animatorSet.playTogether((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
                return animator2;
            }
            Animator[] animatorArr2 = (Animator[]) arrayList.toArray(new Animator[0]);
            animatorSet.playSequentially((Animator[]) Arrays.copyOf(animatorArr2, animatorArr2.length));
        }
        return animator2;
    }

    public final void b(ValueAnimator valueAnimator, XmlResourceParser xmlResourceParser) {
        il dlVar;
        tk tkVar = tk.c;
        Context context = this.a;
        valueAnimator.setInterpolator((TimeInterpolator) tkVar.e(context, xmlResourceParser));
        valueAnimator.setDuration(((Number) sk.d.e(context, xmlResourceParser)).longValue());
        valueAnimator.setStartDelay(((Number) sk.i.e(context, xmlResourceParser)).longValue());
        valueAnimator.setRepeatCount(((Number) sk.g.e(context, xmlResourceParser)).intValue());
        valueAnimator.setRepeatMode(((Number) sk.h.e(context, xmlResourceParser)).intValue());
        String str = (String) sk.f.e(context, xmlResourceParser);
        il ilVar = (il) vk.c.e(context, xmlResourceParser);
        il ilVar2 = (il) vk.d.e(context, xmlResourceParser);
        il ilVar3 = (il) sk.j.e(context, xmlResourceParser);
        if ((ilVar instanceof dl) || (ilVar2 instanceof dl)) {
            dlVar = new dl(0);
        } else if (ilVar3 instanceof hl) {
            dlVar = ilVar3;
            dlVar = new el(0.0f);
        }
        dlVar = ilVar3;
        boolean z = dlVar instanceof el;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        propertyValuesHolderOfInt = null;
        propertyValuesHolderOfInt = null;
        if (dlVar instanceof gl) {
            boolean z2 = ilVar instanceof gl;
            gl glVar = z2 ? (gl) ilVar : null;
            qoc[] qocVarArrQ = glVar != null ? qyj.q(glVar.a) : null;
            boolean z3 = ilVar2 instanceof gl;
            gl glVar2 = z3 ? (gl) ilVar2 : null;
            qoc[] qocVarArrQ2 = glVar2 != null ? qyj.q(glVar2.a) : null;
            if (qocVarArrQ != null || qocVarArrQ2 != null) {
                if (qocVarArrQ != null) {
                    gwd gwdVar = new gwd();
                    if (qocVarArrQ2 == null) {
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofObject(str, gwdVar, qocVarArrQ);
                    } else {
                        if (!qyj.d(qocVarArrQ, qocVarArrQ2)) {
                            gl glVar3 = z2 ? (gl) ilVar : null;
                            String str2 = glVar3 != null ? glVar3.a : null;
                            gl glVar4 = z3 ? (gl) ilVar2 : null;
                            throw new InflateException(qv1.l("Can't morph from ", str2, " to ", glVar4 != null ? glVar4.a : null));
                        }
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofObject(str, gwdVar, qocVarArrQ, qocVarArrQ2);
                    }
                } else if (qocVarArrQ2 != null) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofObject(str, new gwd(), qocVarArrQ2);
                }
            }
        } else {
            ArgbEvaluator argbEvaluator = dlVar instanceof dl ? new ArgbEvaluator() : null;
            if (z) {
                if (ilVar != null) {
                    float f = ((el) ilVar).a;
                    propertyValuesHolderOfInt = ilVar2 != null ? PropertyValuesHolder.ofFloat(str, f, ((el) ilVar2).a) : PropertyValuesHolder.ofFloat(str, f);
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, 0.0f, ((el) ilVar2).a);
                }
            } else if (ilVar != null) {
                int i = ilVar instanceof dl ? ((dl) ilVar).a : ((fl) ilVar).a;
                if (ilVar2 != null) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, ilVar2 instanceof dl ? ((dl) ilVar2).a : ((fl) ilVar2).a);
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i);
                }
            } else if (ilVar2 != null) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, ilVar2 instanceof dl ? ((dl) ilVar2).a : ((fl) ilVar2).a);
            }
            if (propertyValuesHolderOfInt != null && argbEvaluator != null) {
                propertyValuesHolderOfInt.setEvaluator(argbEvaluator);
            }
        }
        if (propertyValuesHolderOfInt != null) {
            valueAnimator.setValues(propertyValuesHolderOfInt);
        }
    }
}
