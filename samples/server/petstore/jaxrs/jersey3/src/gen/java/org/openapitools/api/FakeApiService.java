package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.math.BigDecimal;
import org.openapitools.model.ChildWithNullable;
import org.openapitools.model.Client;
import java.util.Date;
import org.openapitools.model.EnumClass;
import org.openapitools.model.FakeBigDecimalMap200Response;
import java.io.File;
import org.openapitools.model.FileSchemaTestClass;
import org.openapitools.model.HealthCheckResult;
import java.util.Map;
import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.OuterComposite;
import org.openapitools.model.OuterObjectWithEnumProperty;
import org.openapitools.model.Pet;
import org.openapitools.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.model.User;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public abstract class FakeApiService {
    public abstract Response fakeBigDecimalMap(SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakeHealthGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakeHttpSignatureTest(Pet pet,String query1,String header1,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakeOuterBooleanSerialize(Boolean body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakeOuterCompositeSerialize(OuterComposite outerComposite,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakeOuterNumberSerialize(BigDecimal body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakeOuterStringSerialize(String body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakePropertyEnumIntegerSerialize(OuterObjectWithEnumProperty outerObjectWithEnumProperty,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testAdditionalPropertiesReference(Map<String, Object> requestBody,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testBodyWithBinary(File body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testBodyWithFileSchema(FileSchemaTestClass fileSchemaTestClass,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testBodyWithQueryParams( @NotNull String query,User user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testClientModel(Client client,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testEndpointParameters(BigDecimal number,Double _double,String patternWithoutDelimiter,byte[] _byte,Integer integer,Integer int32,Long int64,Float _float,String string,FormDataBodyPart binaryBodypart,Date date,Date dateTime,String password,String paramCallback,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testEnumParameters(List<String> enumHeaderStringArray,String enumHeaderString,List<String> enumQueryStringArray,String enumQueryString,Integer enumQueryInteger,Double enumQueryDouble,List<EnumClass> enumQueryModelArray,List<String> enumFormStringArray,String enumFormString,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testGroupParameters( @NotNull Integer requiredStringGroup, @NotNull Boolean requiredBooleanGroup, @NotNull Long requiredInt64Group,Integer stringGroup,Boolean booleanGroup,Long int64Group,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testInlineAdditionalProperties(Map<String, String> requestBody,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testInlineFreeformAdditionalProperties(TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testJsonFormData(String param,String param2,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testNullable(ChildWithNullable childWithNullable,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testQueryParameterCollectionFormat( @NotNull List<String> pipe, @NotNull List<String> ioutil, @NotNull List<String> http, @NotNull List<String> url, @NotNull List<String> context, @NotNull String allowEmpty,Map<String, String> language,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testStringMapReference(Map<String, String> requestBody,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadFileWithRequiredFile(Long petId,FormDataBodyPart requiredFileBodypart,String additionalMetadata,SecurityContext securityContext) throws NotFoundException;
}
