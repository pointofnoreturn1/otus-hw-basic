DROP TABLE IF EXISTS test CASCADE;
DROP TABLE IF EXISTS question CASCADE;
DROP TABLE IF EXISTS answer CASCADE;

CREATE TABLE test(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    test_name TEXT NOT NULL
);

CREATE TABLE question(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    test_id UUID NOT NULL,
    question_text TEXT NOT NULL
);

CREATE TABLE answer(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    question_id UUID NOT NULL,
    answer_text TEXT NOT NULL,
    is_correct BOOL NOT NULL
);

ALTER TABLE question ADD CONSTRAINT question_test_id_fkey FOREIGN KEY (test_id) REFERENCES test(id);
ALTER TABLE answer ADD CONSTRAINT answer_question_id_fkey FOREIGN KEY (question_id) REFERENCES question(id);
