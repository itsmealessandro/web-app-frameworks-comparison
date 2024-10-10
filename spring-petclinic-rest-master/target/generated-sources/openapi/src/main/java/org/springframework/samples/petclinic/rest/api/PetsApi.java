/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.springframework.samples.petclinic.rest.api;

import org.springframework.samples.petclinic.rest.dto.PetDto;
import org.springframework.samples.petclinic.rest.dto.RestErrorDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-10T17:09:27.164166257+02:00[Europe/Rome]", comments = "Generator version: 7.8.0")
@Validated
@Tag(name = "pet", description = "Endpoints related to pets.")
public interface PetsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /pets : Create a pet
     * Creates a pet .
     *
     * @param petDto The pet (required)
     * @return Pet type created successfully. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Pet not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "addPet",
        summary = "Create a pet",
        description = "Creates a pet .",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Pet type created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PetDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Pet not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pets",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<PetDto> addPet(
        @Parameter(name = "PetDto", description = "The pet", required = true) @Valid @RequestBody PetDto petDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"visits\" : [ { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 }, { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 } ], \"name\" : \"Leo\", \"id\" : 1, \"type\" : { \"name\" : \"cat\", \"id\" : 1 }, \"ownerId\" : 1, \"birthDate\" : \"2010-09-07\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /pets/{petId} : Delete a pet by ID
     * Returns the pet or a 404 error.
     *
     * @param petId The ID of the pet. (required)
     * @return Pet details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Pet not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "deletePet",
        summary = "Delete a pet by ID",
        description = "Returns the pet or a 404 error.",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Pet details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PetDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Pet not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/pets/{petId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PetDto> deletePet(
        @Min(0) @Parameter(name = "petId", description = "The ID of the pet.", required = true, in = ParameterIn.PATH) @PathVariable("petId") Integer petId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"visits\" : [ { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 }, { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 } ], \"name\" : \"Leo\", \"id\" : 1, \"type\" : { \"name\" : \"cat\", \"id\" : 1 }, \"ownerId\" : 1, \"birthDate\" : \"2010-09-07\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pets/{petId} : Get a pet by ID
     * Returns the pet  or a 404 error.
     *
     * @param petId The ID of the pet. (required)
     * @return Pet details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Pet not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "getPet",
        summary = "Get a pet by ID",
        description = "Returns the pet  or a 404 error.",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Pet details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PetDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Pet not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pets/{petId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PetDto> getPet(
        @Min(0) @Parameter(name = "petId", description = "The ID of the pet.", required = true, in = ParameterIn.PATH) @PathVariable("petId") Integer petId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"visits\" : [ { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 }, { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 } ], \"name\" : \"Leo\", \"id\" : 1, \"type\" : { \"name\" : \"cat\", \"id\" : 1 }, \"ownerId\" : 1, \"birthDate\" : \"2010-09-07\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pets : Lists pet
     * Returns an array of pet .
     *
     * @return Pet types found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "listPets",
        summary = "Lists pet",
        description = "Returns an array of pet .",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Pet types found and returned.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PetDto.class)))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pets",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<PetDto>> listPets(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"visits\" : [ { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 }, { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 } ], \"name\" : \"Leo\", \"id\" : 1, \"type\" : { \"name\" : \"cat\", \"id\" : 1 }, \"ownerId\" : 1, \"birthDate\" : \"2010-09-07\" }, { \"visits\" : [ { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 }, { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 } ], \"name\" : \"Leo\", \"id\" : 1, \"type\" : { \"name\" : \"cat\", \"id\" : 1 }, \"ownerId\" : 1, \"birthDate\" : \"2010-09-07\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /pets/{petId} : Update a pet by ID
     * Returns the pet or a 404 error.
     *
     * @param petId The ID of the pet. (required)
     * @param petDto The pet (required)
     * @return Pet details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Pet not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "updatePet",
        summary = "Update a pet by ID",
        description = "Returns the pet or a 404 error.",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Pet details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PetDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Pet not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/pets/{petId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<PetDto> updatePet(
        @Min(0) @Parameter(name = "petId", description = "The ID of the pet.", required = true, in = ParameterIn.PATH) @PathVariable("petId") Integer petId,
        @Parameter(name = "PetDto", description = "The pet", required = true) @Valid @RequestBody PetDto petDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"visits\" : [ { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 }, { \"date\" : \"2013-01-01\", \"petId\" : 1, \"description\" : \"rabies shot\", \"id\" : 1 } ], \"name\" : \"Leo\", \"id\" : 1, \"type\" : { \"name\" : \"cat\", \"id\" : 1 }, \"ownerId\" : 1, \"birthDate\" : \"2010-09-07\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"/api/owners\", \"trace\" : \"com.atlassian.oai.validator.springmvc.InvalidRequestException: ...\", \"schemaValidationErrors\" : [ { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" }, { \"message\" : \"[Path '/lastName'] Instance type (null) does not match any allowed primitive type (allowed: ['string'])\" } ], \"error\" : \"Bad Request\", \"message\" : \"Request failed schema validation\", \"status\" : 400, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
