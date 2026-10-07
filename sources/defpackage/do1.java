package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class do1 extends zj5 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do1(ny8 ny8Var, rrc rrcVar, int i) {
        super(ny8Var, rrcVar);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:169:0x035d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0389  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:84:0x0182  */
    @Override // defpackage.hc6
    public final void a(String str, b9b b9bVar, List list, lrc lrcVar, String str2) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        float fFloatValue7;
        float fFloatValue8;
        float fFloatValue9;
        float fFloatValue10;
        float fFloatValue11 = Float.NaN;
        switch (this.c) {
            case 0:
                yj5 yj5VarB = b();
                ylc ylcVar = (ylc) ww3.u1(0, list);
                float fLongValue = ylcVar != null ? ((Number) ylcVar.b).longValue() : Float.NaN;
                Boolean bool = (Boolean) b9bVar.d("incoming_call");
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf != null) {
                    float fFloatValue12 = numValueOf.floatValue();
                    Float fValueOf = Float.valueOf(fFloatValue12);
                    if (fFloatValue12 == 0.0f) {
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
                Boolean bool2 = (Boolean) b9bVar.d("group_call");
                Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 != null) {
                    float fFloatValue13 = numValueOf2.floatValue();
                    Float fValueOf2 = Float.valueOf(fFloatValue13);
                    if (fFloatValue13 == 0.0f) {
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
                Boolean bool3 = (Boolean) b9bVar.d("call_initialized");
                Integer numValueOf3 = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
                if (numValueOf3 != null) {
                    float fFloatValue14 = numValueOf3.floatValue();
                    Float fValueOf3 = fFloatValue14 != 0.0f ? Float.valueOf(fFloatValue14) : null;
                    if (fValueOf3 != null) {
                        fFloatValue11 = fValueOf3.floatValue();
                    }
                }
                yj5.a(yj5VarB, xj5.CALLS_INIT, fLongValue, 0.0f, 0.0f, 0.0f, fFloatValue, fFloatValue2, fFloatValue11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, -228);
                break;
            case 1:
                yj5 yj5VarB2 = b();
                ylc ylcVar2 = (ylc) ww3.u1(0, list);
                float fLongValue2 = ylcVar2 != null ? ((Number) ylcVar2.b).longValue() : Float.NaN;
                ylc ylcVar3 = (ylc) ww3.u1(1, list);
                float fLongValue3 = ylcVar3 != null ? ((Number) ylcVar3.b).longValue() : Float.NaN;
                ylc ylcVar4 = (ylc) ww3.u1(2, list);
                float fLongValue4 = ylcVar4 != null ? ((Number) ylcVar4.b).longValue() : Float.NaN;
                ylc ylcVar5 = (ylc) ww3.u1(3, list);
                float fLongValue5 = ylcVar5 != null ? ((Number) ylcVar5.b).longValue() : Float.NaN;
                Boolean bool4 = (Boolean) b9bVar.d("incoming_call");
                Integer numValueOf4 = bool4 != null ? Integer.valueOf(bool4.booleanValue() ? 1 : 0) : null;
                if (numValueOf4 != null) {
                    float fFloatValue15 = numValueOf4.floatValue();
                    Float fValueOf4 = Float.valueOf(fFloatValue15);
                    if (fFloatValue15 == 0.0f) {
                        fValueOf4 = null;
                    }
                    if (fValueOf4 != null) {
                        fFloatValue3 = fValueOf4.floatValue();
                    } else {
                        fFloatValue3 = Float.NaN;
                    }
                } else {
                    fFloatValue3 = Float.NaN;
                }
                Boolean bool5 = (Boolean) b9bVar.d("group_call");
                Integer numValueOf5 = bool5 != null ? Integer.valueOf(bool5.booleanValue() ? 1 : 0) : null;
                if (numValueOf5 != null) {
                    float fFloatValue16 = numValueOf5.floatValue();
                    Float fValueOf5 = Float.valueOf(fFloatValue16);
                    if (fFloatValue16 == 0.0f) {
                        fValueOf5 = null;
                    }
                    if (fValueOf5 != null) {
                        fFloatValue11 = fValueOf5.floatValue();
                    }
                }
                Object objD = b9bVar.d("call_type");
                yj5.a(yj5VarB2, xj5.CALL_SCREEN_INIT, fLongValue2, fLongValue3, fLongValue4, fLongValue5, fFloatValue3, fFloatValue11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, objD instanceof String ? (String) objD : null, null, null, null, null, null, null, -131200);
                break;
            case 2:
                yj5 yj5VarB3 = b();
                ylc ylcVar6 = (ylc) ww3.u1(0, list);
                float fLongValue6 = ylcVar6 != null ? ((Number) ylcVar6.b).longValue() : Float.NaN;
                Object objD2 = b9bVar.d("skip_reason");
                String str3 = objD2 instanceof String ? (String) objD2 : null;
                Object objD3 = b9bVar.d("conversation_id");
                yj5.a(yj5VarB3, xj5.INCOMING_CALL_INIT, fLongValue6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, str3, objD3 instanceof String ? (String) objD3 : null, null, null, null, null, null, -393220);
                break;
            default:
                yj5 yj5VarB4 = b();
                float fA = lrcVar != null ? lrcVar.a() : -1.0f;
                ylc ylcVar7 = (ylc) ww3.u1(0, list);
                float fLongValue7 = ylcVar7 != null ? ((Number) ylcVar7.b).longValue() : Float.NaN;
                ylc ylcVar8 = (ylc) ww3.u1(1, list);
                float fLongValue8 = ylcVar8 != null ? ((Number) ylcVar8.b).longValue() : Float.NaN;
                ylc ylcVar9 = (ylc) ww3.u1(2, list);
                float fLongValue9 = ylcVar9 != null ? ((Number) ylcVar9.b).longValue() : Float.NaN;
                ylc ylcVar10 = (ylc) ww3.u1(3, list);
                float fLongValue10 = ylcVar10 != null ? ((Number) ylcVar10.b).longValue() : Float.NaN;
                ylc ylcVar11 = (ylc) ww3.u1(4, list);
                float fLongValue11 = ylcVar11 != null ? ((Number) ylcVar11.b).longValue() : Float.NaN;
                Long l = (Long) b9bVar.d("fcp");
                if (l != null) {
                    float fFloatValue17 = l.floatValue();
                    Float fValueOf6 = Float.valueOf(fFloatValue17);
                    if (fFloatValue17 == 0.0f) {
                        fValueOf6 = null;
                    }
                    if (fValueOf6 != null) {
                        fFloatValue4 = fValueOf6.floatValue();
                    } else {
                        fFloatValue4 = Float.NaN;
                    }
                } else {
                    fFloatValue4 = Float.NaN;
                }
                Byte b = (Byte) b9bVar.d("device_class");
                if (b != null) {
                    float fFloatValue18 = b.floatValue();
                    Float fValueOf7 = Float.valueOf(fFloatValue18);
                    if (fFloatValue18 == 0.0f) {
                        fValueOf7 = null;
                    }
                    if (fValueOf7 != null) {
                        fFloatValue5 = fValueOf7.floatValue();
                    } else {
                        fFloatValue5 = Float.NaN;
                    }
                } else {
                    fFloatValue5 = Float.NaN;
                }
                Integer num = (Integer) b9bVar.d("error_code");
                if (num != null) {
                    float fFloatValue19 = num.floatValue();
                    Float fValueOf8 = Float.valueOf(fFloatValue19);
                    if (fFloatValue19 == 0.0f) {
                        fValueOf8 = null;
                    }
                    if (fValueOf8 != null) {
                        fFloatValue6 = fValueOf8.floatValue();
                    } else {
                        fFloatValue6 = Float.NaN;
                    }
                } else {
                    fFloatValue6 = Float.NaN;
                }
                Integer num2 = (Integer) b9bVar.d("first_paint_skipped");
                if (num2 != null) {
                    float fFloatValue20 = num2.floatValue();
                    Float fValueOf9 = Float.valueOf(fFloatValue20);
                    if (fFloatValue20 == 0.0f) {
                        fValueOf9 = null;
                    }
                    if (fValueOf9 != null) {
                        fFloatValue7 = fValueOf9.floatValue();
                    } else {
                        fFloatValue7 = Float.NaN;
                    }
                } else {
                    fFloatValue7 = Float.NaN;
                }
                Integer num3 = (Integer) b9bVar.d("webview_major");
                if (num3 != null) {
                    float fFloatValue21 = num3.floatValue();
                    Float fValueOf10 = Float.valueOf(fFloatValue21);
                    if (fFloatValue21 == 0.0f) {
                        fValueOf10 = null;
                    }
                    if (fValueOf10 != null) {
                        fFloatValue8 = fValueOf10.floatValue();
                    } else {
                        fFloatValue8 = Float.NaN;
                    }
                } else {
                    fFloatValue8 = Float.NaN;
                }
                Integer num4 = (Integer) b9bVar.d("connection_type");
                if (num4 != null) {
                    float fFloatValue22 = num4.floatValue();
                    Float fValueOf11 = Float.valueOf(fFloatValue22);
                    if (fFloatValue22 == 0.0f) {
                        fValueOf11 = null;
                    }
                    if (fValueOf11 != null) {
                        fFloatValue9 = fValueOf11.floatValue();
                    } else {
                        fFloatValue9 = Float.NaN;
                    }
                } else {
                    fFloatValue9 = Float.NaN;
                }
                Integer num5 = (Integer) b9bVar.d("warm_init");
                if (num5 != null) {
                    float fFloatValue23 = num5.floatValue();
                    Float fValueOf12 = Float.valueOf(fFloatValue23);
                    if (fFloatValue23 == 0.0f) {
                        fValueOf12 = null;
                    }
                    if (fValueOf12 != null) {
                        fFloatValue10 = fValueOf12.floatValue();
                    } else {
                        fFloatValue10 = Float.NaN;
                    }
                } else {
                    fFloatValue10 = Float.NaN;
                }
                Long l2 = (Long) b9bVar.d("id");
                if (l2 != null) {
                    float fFloatValue24 = l2.floatValue();
                    Float fValueOf13 = Float.valueOf(fFloatValue24);
                    if (fFloatValue24 == 0.0f) {
                        fValueOf13 = null;
                    }
                    if (fValueOf13 != null) {
                        fFloatValue11 = fValueOf13.floatValue();
                    }
                }
                float f = fFloatValue11;
                Object objD4 = b9bVar.d("webview_version");
                String str4 = objD4 instanceof String ? (String) objD4 : null;
                Object objD5 = b9bVar.d("webview_package");
                yj5.a(yj5VarB4, xj5.WEB_APP, fA, fLongValue7, fLongValue8, fLongValue9, fLongValue10, fLongValue11, 0.0f, 0.0f, fFloatValue4, fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue8, fFloatValue9, fFloatValue10, f, str4, objD5 instanceof String ? (String) objD5 : null, null, null, null, null, null, -523904);
                break;
        }
    }
}
