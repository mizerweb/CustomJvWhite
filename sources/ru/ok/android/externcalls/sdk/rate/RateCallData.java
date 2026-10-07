package ru.ok.android.externcalls.sdk.rate;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/RateCallData;", "", "maxRateForQuestion", "", "questions", "", "Lru/ok/android/externcalls/sdk/rate/Question;", "<init>", "(ILjava/util/List;)V", "getMaxRateForQuestion", "()I", "getQuestions", "()Ljava/util/List;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RateCallData {
    private final int maxRateForQuestion;
    private final List<Question> questions;

    public RateCallData(int i, List<Question> list) {
        this.maxRateForQuestion = i;
        this.questions = list;
    }

    public final int getMaxRateForQuestion() {
        return this.maxRateForQuestion;
    }

    public final List<Question> getQuestions() {
        return this.questions;
    }
}
