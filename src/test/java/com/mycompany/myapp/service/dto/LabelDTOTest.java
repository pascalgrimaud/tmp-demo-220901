package com.mycompany.myapp.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class LabelDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(LabelDTO.class);
        LabelDTO labelDTO1 = new LabelDTO();
        labelDTO1.setId(1L);
        LabelDTO labelDTO2 = new LabelDTO();
        assertThat(labelDTO1).isNotEqualTo(labelDTO2);
        labelDTO2.setId(labelDTO1.getId());
        assertThat(labelDTO1).isEqualTo(labelDTO2);
        labelDTO2.setId(2L);
        assertThat(labelDTO1).isNotEqualTo(labelDTO2);
        labelDTO1.setId(null);
        assertThat(labelDTO1).isNotEqualTo(labelDTO2);
    }
}
