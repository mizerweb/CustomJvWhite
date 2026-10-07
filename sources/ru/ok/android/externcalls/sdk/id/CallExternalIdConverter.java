package ru.ok.android.externcalls.sdk.id;

import defpackage.hi1;

/* JADX INFO: loaded from: classes3.dex */
public class CallExternalIdConverter {
    private CallExternalIdConverter() {
    }

    public static ParticipantId convert(hi1 hi1Var) {
        if (hi1Var == null) {
            return null;
        }
        return new ParticipantId(hi1Var.a, hi1Var.b == 3, hi1Var.c);
    }
}
