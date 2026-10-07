package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s03 extends zj5 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s03(ny8 ny8Var, rrc rrcVar, int i) {
        super(ny8Var, rrcVar);
        this.c = i;
    }

    public static float c(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((ylc) next).a, str));
        ylc ylcVar = (ylc) next;
        if (ylcVar != null) {
            return ((Number) ylcVar.b).longValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    @Override // defpackage.hc6
    public final void a(String str, b9b b9bVar, List list, lrc lrcVar, String str2) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3 = Float.NaN;
        switch (this.c) {
            case 0:
                yj5 yj5VarB = b();
                ylc ylcVar = (ylc) ww3.u1(0, list);
                float fLongValue = ylcVar != null ? ((Number) ylcVar.b).longValue() : Float.NaN;
                ylc ylcVar2 = (ylc) ww3.u1(1, list);
                float fLongValue2 = ylcVar2 != null ? ((Number) ylcVar2.b).longValue() : Float.NaN;
                ylc ylcVar3 = (ylc) ww3.u1(2, list);
                float fLongValue3 = ylcVar3 != null ? ((Number) ylcVar3.b).longValue() : Float.NaN;
                ylc ylcVar4 = (ylc) ww3.u1(3, list);
                float fLongValue4 = ylcVar4 != null ? ((Number) ylcVar4.b).longValue() : Float.NaN;
                ylc ylcVar5 = (ylc) ww3.u1(4, list);
                float fLongValue5 = ylcVar5 != null ? ((Number) ylcVar5.b).longValue() : Float.NaN;
                Byte b = (Byte) b9bVar.d("class");
                if (b != null) {
                    float fFloatValue4 = b.floatValue();
                    Float fValueOf = Float.valueOf(fFloatValue4);
                    if (fFloatValue4 == 0.0f) {
                        fValueOf = null;
                    }
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    } else {
                        fFloatValue = Float.NaN;
                    }
                } else {
                    fFloatValue = Float.NaN;
                }
                Integer num = (Integer) b9bVar.d("waited_frames");
                if (num != null) {
                    float fFloatValue5 = num.floatValue();
                    Float fValueOf2 = Float.valueOf(fFloatValue5);
                    if (fFloatValue5 == 0.0f) {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fFloatValue2 = fValueOf2.floatValue();
                    } else {
                        fFloatValue2 = Float.NaN;
                    }
                } else {
                    fFloatValue2 = Float.NaN;
                }
                Integer num2 = (Integer) b9bVar.d("warm");
                if (num2 != null) {
                    float fFloatValue6 = num2.floatValue();
                    Float fValueOf3 = fFloatValue6 != 0.0f ? Float.valueOf(fFloatValue6) : null;
                    if (fValueOf3 != null) {
                        fFloatValue3 = fValueOf3.floatValue();
                    }
                }
                yj5.a(yj5VarB, xj5.CHAT_LIST, fLongValue, fLongValue2, fLongValue3, fLongValue4, fLongValue5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fFloatValue, fFloatValue2, fFloatValue3, null, null, null, null, null, null, null, -114752);
                break;
            default:
                yj5 yj5VarB2 = b();
                ylc ylcVar6 = (ylc) ww3.u1(0, list);
                float fLongValue6 = ylcVar6 != null ? ((Number) ylcVar6.b).longValue() : Float.NaN;
                float fC = c("story_owners_screen_created", list);
                float fC2 = c("story_screen_created", list);
                float fC3 = c("story_data_loaded", list);
                float fC4 = c("story_preview_shown", list);
                float fC5 = c("story_shown", list);
                float fA = lrcVar != null ? lrcVar.a() : -1.0f;
                Object objD = b9bVar.d("mode");
                String str3 = objD instanceof String ? (String) objD : null;
                Object objD2 = b9bVar.d("owner_type");
                String str4 = objD2 instanceof String ? (String) objD2 : null;
                Object objD3 = b9bVar.d("story_type");
                String str5 = objD3 instanceof String ? (String) objD3 : null;
                Object objD4 = b9bVar.d("owner_id");
                String string = objD4 != null ? objD4.toString() : null;
                Object objD5 = b9bVar.d("story_id");
                yj5.a(yj5VarB2, xj5.STORY_VIEWER_OPEN, fLongValue6, fC, fC2, fC3, fC4, fC5, fA, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, str3, str4, str5, string, objD5 != null ? objD5.toString() : null, str2, null, -8257792);
                break;
        }
    }
}
