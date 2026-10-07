package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.ArrayMap;
import android.util.Log;
import android.util.LruCache;
import java.io.IOException;
import java.util.ArrayList;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class uj {
    public static final pgg c = new pgg(22);
    public final Context a;
    public final Resources b;

    public uj(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    public static boolean d(Animator animator) {
        AnimatorSet animatorSet = animator instanceof AnimatorSet ? (AnimatorSet) animator : null;
        if (animatorSet == null) {
            ObjectAnimator objectAnimator = animator instanceof ObjectAnimator ? (ObjectAnimator) animator : null;
            return cqk.d(objectAnimator != null ? objectAnimator.getPropertyName() : null, "pathData");
        }
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        if (childAnimations.isEmpty()) {
            return false;
        }
        for (Animator animator2 : childAnimations) {
            ObjectAnimator objectAnimator2 = animator2 instanceof ObjectAnimator ? (ObjectAnimator) animator2 : null;
            if (cqk.d(objectAnimator2 != null ? objectAnimator2.getPropertyName() : null, "pathData")) {
                return true;
            }
        }
        return false;
    }

    public final Animator a(int i) {
        cl clVar = new cl(this.a);
        pgg pggVar = cl.c;
        Animator animator = (Animator) ((LruCache) pggVar.a).get(Integer.valueOf(i));
        if (animator != null) {
            return animator.clone();
        }
        Animator animatorA = clVar.a(clVar.b.getAnimation(i), null, 0);
        if (animatorA == null) {
            ore.p("Required value was null.");
            return null;
        }
        ((LruCache) pggVar.a).put(Integer.valueOf(i), animatorA.clone());
        return animatorA;
    }

    public final tj b(int i) throws XmlPullParserException, IOException {
        tj tjVar;
        int i2;
        pgg pggVar = c;
        tj tjVar2 = (tj) ((LruCache) pggVar.a).get(Integer.valueOf(i));
        int i3 = 0;
        if (tjVar2 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayMap arrayMap = new ArrayMap();
            ArrayList arrayList2 = tjVar2.b;
            int iO0 = xw3.O0(arrayList2);
            if (iO0 >= 0) {
                int i4 = 0;
                while (true) {
                    Object objU1 = ww3.u1(i4, arrayList2);
                    if (objU1 != null) {
                        Animator animator = (Animator) objU1;
                        Animator animatorClone = animator.clone();
                        arrayList.add(animatorClone);
                        arrayMap.put(animatorClone, tjVar2.c.get(animator));
                    }
                    if (i4 == iO0) {
                        break;
                    }
                    i4++;
                }
            }
            tjVar = new tj(new EnhancedVectorDrawable(tjVar2.a), arrayList, arrayMap);
        } else {
            tjVar = null;
        }
        if (tjVar != null) {
            return tjVar;
        }
        XmlResourceParser xml = this.b.getXml(i);
        int next = xml.next();
        while (true) {
            i2 = 2;
            if (next == 2 || next == 1) {
                break;
            }
            next = xml.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayMap arrayMap2 = new ArrayMap();
        try {
            try {
                int eventType = xml.getEventType();
                int depth = xml.getDepth();
                EnhancedVectorDrawable enhancedVectorDrawable = null;
                while (eventType != 1 && (xml.getDepth() >= depth || eventType != 3)) {
                    if (eventType != i2) {
                        eventType = xml.next();
                    } else {
                        String name = xml.getName();
                        if (cqk.d(name, "animated-vector")) {
                            EnhancedVectorDrawable enhancedVectorDrawableC = c(xml);
                            enhancedVectorDrawableC.getPixelSize();
                            enhancedVectorDrawable = enhancedVectorDrawableC;
                        } else if (cqk.d(name, "target")) {
                            int attributeCount = xml.getAttributeCount();
                            int i5 = i3;
                            String attributeValue = null;
                            while (i5 < attributeCount) {
                                String attributeName = xml.getAttributeName(i5);
                                if (cqk.d(attributeName, SdkMetricStatEvent.NAME_KEY)) {
                                    attributeValue = xml.getAttributeValue(i5);
                                } else if (cqk.d(attributeName, "animation")) {
                                    int attributeResourceValue = xml.getAttributeResourceValue(i5, i3);
                                    if (attributeResourceValue != 0) {
                                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.a, attributeResourceValue);
                                        if (d(animatorLoadAnimator)) {
                                            animatorLoadAnimator = a(attributeResourceValue);
                                        }
                                        arrayList3.add(animatorLoadAnimator);
                                        arrayMap2.put(animatorLoadAnimator, attributeValue);
                                    }
                                } else {
                                    Log.w(uj.class.getSimpleName(), "unknown attribute '" + attributeName + "'. Skipping");
                                }
                                i5++;
                                i3 = 0;
                            }
                        }
                        eventType = xml.next();
                        i3 = 0;
                        i2 = 2;
                    }
                }
                xml.close();
                if (enhancedVectorDrawable == null) {
                    ore.p("VectorDrawable was not found in XML");
                    return null;
                }
                tj tjVar3 = new tj(enhancedVectorDrawable, arrayList3, arrayMap2);
                ((LruCache) pggVar.a).put(Integer.valueOf(i), tjVar3);
                return tjVar3;
            } catch (IOException e) {
                e.printStackTrace();
                throw e;
            } catch (XmlPullParserException e2) {
                e2.printStackTrace();
                throw e2;
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public final EnhancedVectorDrawable c(XmlResourceParser xmlResourceParser) {
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (cqk.d(xmlResourceParser.getAttributeName(i), "drawable")) {
                int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
                if (attributeResourceValue == 0) {
                    break;
                }
                return new EnhancedVectorDrawable(this.b, attributeResourceValue);
            }
        }
        c.t();
        return null;
    }
}
